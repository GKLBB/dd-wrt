// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_lv_LV extends ListResourceBundle
{
  static final String decimalSeparator = ",";
  static final String groupingSeparator = "\u00A0";
  static final String numberFormat = "#,###,##0.###";
  static final String percentFormat = "#,###,##0%";
  static final String[] weekdays = { null, "sv\u0113tdiena", "pirmdiena", "otrdiena", "tre\u0161diena", "ceturtdiena", "piektdiena", "sestdiena" };

  static final String[] shortWeekdays = { null, "Sv", "P\u00A0", "O\u00A0", "T\u00A0", "C\u00A0", "Pk", "S\u00A0" };

  static final String[] shortMonths = { "jan", "feb", "mar", "apr", "mai", "j\u016Bn", "j\u016Bl", "aug", "sep", "okt", "nov", "dec", null };

  static final String[] months = { "janv\u0101ris", "febru\u0101ris", "marts", "apr\u012Blis", "maijs", "j\u016Bnijs", "j\u016Blijs", "augusts", "septembris", "oktobris", "novembris", "decembris", null };

  static final String[] ampms = { "", "" };

  static final String shortDateFormat = "yyyy.MM.dd.";
  static final String defaultTimeFormat = "";
  static final String currencySymbol = "Ls";
  static final String intlCurrencySymbol = "LVL";
  static final String currencyFormat = "$ #,###,##0.00;-$ #,###,##0.00";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}
