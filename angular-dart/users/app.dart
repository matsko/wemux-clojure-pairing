import 'package:angular/angular.dart';

class UsersModule extends Module {
  UsersModule() {
    type(UsersCtrl);
    type(UserData);
  }
}

@NgController(
  selector: '[users-ctrl]',
  publishAs: 'users'
)
@NgController(
  selector: 'users-ctrl',
  publishAs: 'users'
)
class UsersCtrl {
  UserData _users;
  Scope _scope;

  UsersCtrl(UserData this._users, Scope this._scope);

  addUser(user) {
    _users.add(user);
  }

  removeUser(user) {
    _users.remove(user);
  }

  getUsers() {
    return _users.getUsers();
  }
}

@NgInjectableService()
class UserData {

  UsersData();

  var users = [
    { 'name' : 'Lukas' }
  ];

  getUsers() {
    return users;
  }
}


main() {
  ngBootstrap(module: new UsersModule());
}
