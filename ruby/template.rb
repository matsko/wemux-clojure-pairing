require 'rubygems'
require 'erb'

template = ERB.new(File.read("template.html.erb"))
puts template.result
