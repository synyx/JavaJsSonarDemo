describe("calculator", function() {
	
	var calc = calculator;
	
	it("should be defined", function() {
		expect(calc).toBeDefined();
	});
	
	it("should return 42 when adding 2 to 40", function() {
		var result = calc.add(40, 2);
		expect(result).toBe(42);
	});
	
});