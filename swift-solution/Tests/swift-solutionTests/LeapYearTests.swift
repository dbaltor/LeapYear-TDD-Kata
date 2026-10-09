import Testing
@testable import swift_solution

@Suite("Leap year tests") struct LeapYearTests {

  @Test func test_typical_common_year() throws {

    let commonYear = 2001
    #expect(!LeapYear.isLeap(year: commonYear), "\(commonYear) should not be a leap year")
  }

  @Test func test_atypical_common_year() throws {

    let commonYear = 1900
    #expect(!LeapYear.isLeap(year: commonYear), "\(commonYear) should not be a leap year")
  }

  @Test func test_typical_leap_year() throws {

    let commonYear = 1996
    #expect(LeapYear.isLeap(year: commonYear), "\(commonYear) should be a leap year")
  }

  @Test func test_atypical_leap_year() throws {

    let commonYear = 2000
    #expect(LeapYear.isLeap(year: commonYear), "\(commonYear) should be a leap year")
  }

}
