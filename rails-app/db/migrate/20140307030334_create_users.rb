class CreateUsers < ActiveRecord::Migration
  def self.up
    create_table :users do |t|
      t.string :first_name
      t.string :last_name
      t.number :age

      t.timestamps
    end
  end

  def self.down
    drop_table :users
  end
end
