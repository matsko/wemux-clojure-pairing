class Man
  attr_accessor :name, :age, :city
  def initialize(value)
    @value = value
  end

  def show
    puts @value
  end

  def man?
	  true
  end
end

class Manager < Man
  def self.show
    puts "hello..."
  end
  def show
    super()
  end
end

man = Man.new("...")
man.name = 'matias'
man.name

def repeat(count, &code)
  count.times do 
    yield
  end
end

=begin
repeat(5) do
  puts "hello"
  puts "hello"
  puts "-"
end

name = :matias.to_s
name = 'matias'.to_sym

colors = ['red','two','three','four']
likedColors = {
	'red' => true,
	'blue' => false
}
=end


'A'..'Z'
# rbenv
#

for i in 0..10 do
end

while true do
end

5.times do
end

until false do
end

if value
elsif 
else
end

unless value
else

end
