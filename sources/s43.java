// default package

import android.icu.util.ULocale;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s43 {
    public final int a;
    public final c b;
    public boolean c;
    public TL_wallet.currencyRates d;
    public String e = "en";
    public String f;

    public s43(c cVar) {
        this.b = cVar;
        this.a = cVar.a;
        try {
            this.f = a.b.getSharedPreferences("gram_wallet", 0).getString("currency", g());
        } catch (Exception e) {
            cc4.e("[gram-wallet] failed to load currency prefs", e);
        }
        if (TextUtils.equals(g(), "USD")) {
            return;
        }
        f();
    }

    public static void a(LinkedHashSet linkedHashSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Currency currency = Currency.getInstance(new Locale("", str.toUpperCase(Locale.US)));
            if (currency != null) {
                linkedHashSet.add(currency.getCurrencyCode());
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static void b(LinkedHashSet linkedHashSet, InputMethodSubtype inputMethodSubtype) {
        if (inputMethodSubtype == null || !"keyboard".equals(inputMethodSubtype.getMode())) {
            return;
        }
        String languageTag = Build.VERSION.SDK_INT >= 24 ? inputMethodSubtype.getLanguageTag() : null;
        if (TextUtils.isEmpty(languageTag)) {
            languageTag = inputMethodSubtype.getLocale();
        }
        if (TextUtils.isEmpty(languageTag)) {
            return;
        }
        c(linkedHashSet, Locale.forLanguageTag(languageTag.replace('_', '-')));
    }

    public static void c(LinkedHashSet linkedHashSet, Locale locale) {
        if (locale == null) {
            return;
        }
        String country = locale.getCountry();
        if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
            country = ULocale.addLikelySubtags(ULocale.forLocale(locale)).getCountry();
        }
        a(linkedHashSet, country);
    }

    public static String d(String str, Locale locale) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            int charCount = Character.charCount(codePointAt) + i;
            if (Character.isLetter(codePointAt)) {
                return str.substring(0, i) + str.substring(i, charCount).toUpperCase(locale) + str.substring(charCount);
            }
            i = charCount;
        }
        return str;
    }

    public static TL_wallet.currencyRate e() {
        TL_wallet.currencyRate currencyrate = new TL_wallet.currencyRate();
        currencyrate.currency = "USD";
        currencyrate.rate = 1.0d;
        currencyrate.title = ob6.M0(2131742798, null);
        currencyrate.symbol = "$";
        currencyrate.thousandsSeparator = ",";
        currencyrate.decimalSeparator = ".";
        currencyrate.symbolLeft = true;
        currencyrate.spaceBetween = false;
        currencyrate.dropZeros = false;
        currencyrate.exp = 2;
        return currencyrate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TL_wallet.currencyRates f() {
        Object[] objArr = 0;
        if (this.d != null) {
            Locale locale = ob6.D0().y;
            String language = (locale == null || TextUtils.isEmpty(locale.getLanguage())) ? "en" : locale.getLanguage();
            if (!TextUtils.equals(this.e, language)) {
                boolean equals = TextUtils.equals(language, "en");
                for (int i = 0; i < this.d.rates.size(); i++) {
                    TL_wallet.currencyRate currencyrate = this.d.rates.get(i);
                    if (currencyrate != null) {
                        currencyrate.translatedTitle = null;
                        if (!equals && !TextUtils.isEmpty(currencyrate.currency)) {
                            try {
                                currencyrate.translatedTitle = d(Currency.getInstance(currencyrate.currency).getDisplayName(locale), locale);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                    }
                }
                this.e = language;
            }
        } else {
            if (this.c) {
                return null;
            }
            this.c = true;
            ConnectionsManager.getInstance(this.a).sendRequestTyped(new TL_wallet.getCurrencyRates(), new ic(objArr == true ? 1 : 0), new n82(this, (byte) 16));
        }
        return this.d;
    }

    public final String g() {
        String str = this.f;
        return str == null ? "USD" : str;
    }

    public final double h() {
        String g = g();
        if (TextUtils.equals(g, "USD")) {
            return 1.0d;
        }
        if (this.d == null) {
            return 0.0d;
        }
        for (int i = 0; i < this.d.rates.size(); i++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i);
            if (TextUtils.equals(currencyrate.currency, g)) {
                return currencyrate.rate;
            }
        }
        return 0.0d;
    }

    public final String i() {
        String g = g();
        TL_wallet.currencyRates f = f();
        if (f == null) {
            return "";
        }
        for (int i = 0; i < f.rates.size(); i++) {
            TL_wallet.currencyRate currencyrate = f.rates.get(i);
            if (TextUtils.equals(currencyrate.currency, g)) {
                return TextUtils.isEmpty(currencyrate.translatedTitle) ? currencyrate.title : currencyrate.translatedTitle;
            }
        }
        return "";
    }

    public final TL_wallet.currencyRate j() {
        String g = g();
        if (this.d == null) {
            if (TextUtils.equals(g, "USD")) {
                return e();
            }
            return null;
        }
        for (int i = 0; i < this.d.rates.size(); i++) {
            TL_wallet.currencyRate currencyrate = this.d.rates.get(i);
            if (TextUtils.equals(currencyrate.currency, g)) {
                return currencyrate;
            }
        }
        return null;
    }
}
