require './file'
require 'rubygems'
require 'rspec'

describe "Man" do
  it "should be true" do
    man = Man.new("value")
    man.should be_man
  end
end
