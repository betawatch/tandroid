package zf;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a {
    public final b a;
    public final long b;

    public a(long j3, b bVar) {
        this.a = bVar;
        this.b = j3;
    }

    public static a g(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3 * 1000000000, bVar);
    }

    public static a h(String str, b bVar) {
        try {
            BigDecimal multiply = new BigDecimal(str).multiply(BigDecimal.valueOf(1000000000L));
            if (multiply.compareTo(BigDecimal.valueOf(Long.MAX_VALUE)) > 0) {
                return null;
            }
            return i(multiply.longValue(), bVar);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static a i(long j3, b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(j3, bVar);
    }

    public static a j(double d, b bVar) {
        b bVar2 = b.b;
        if (bVar == bVar2) {
            return new a((long) ((d / MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get()) * 1000000000), bVar2).n(2);
        }
        b bVar3 = b.a;
        return bVar == bVar3 ? new a((long) (((d * 100000.0d) / MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) * 1000000000), bVar3).n(0) : g(0L, bVar);
    }

    public static a l(TL_stars.StarsAmount starsAmount) {
        if (starsAmount instanceof TL_stars.TL_starsAmount) {
            return i((starsAmount.amount * 1000000000) + starsAmount.nanos, b.a);
        }
        if (starsAmount instanceof TL_stars.TL_starsTonAmount) {
            return i(starsAmount.amount, b.b);
        }
        return null;
    }

    public static a m(TL_stars.StarsAmount starsAmount) {
        a l4 = l(starsAmount);
        return l4 != null ? l4 : i(0L, b.a);
    }

    public final long a() {
        return this.b / 1000000000;
    }

    public final String b() {
        BigDecimal divide = new BigDecimal(this.b).divide(BigDecimal.valueOf(1000000000L), MathContext.UNLIMITED);
        return (divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros()).toPlainString();
    }

    public final double c() {
        return this.b / 1000000000;
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder(LocaleController.formatNumber(a(), ','));
        long j3 = this.b % 1000000000;
        if (j3 == 0) {
            return sb2.toString();
        }
        sb2.append('.');
        String l4 = Long.toString(j3);
        int length = 9 - l4.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        int length2 = l4.length();
        while (length2 > 0 && l4.charAt(length2 - 1) == '0') {
            length2--;
        }
        sb2.append((CharSequence) l4, 0, length2);
        return sb2.toString();
    }

    public final a e(b bVar) {
        b bVar2 = this.a;
        if (bVar2 == bVar) {
            return this;
        }
        return j(bVar2 == b.a ? ((c() / 1000.0d) * MessagesController.getInstance(UserConfig.selectedAccount).starsUsdSellRate1000) / 100.0d : bVar2 == b.b ? c() * MessagesController.getInstance(UserConfig.selectedAccount).config.tonUsdRate.get() : 0.0d, bVar);
    }

    public final boolean equals(Object obj) {
        a aVar;
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && (this == (aVar = (a) obj) || (this.a == aVar.a && this.b == aVar.b));
    }

    public final String f() {
        long j3 = this.b % 1000000000;
        b bVar = this.a;
        if (j3 == 0) {
            int ordinal = bVar.ordinal();
            return ordinal != 0 ? ordinal != 1 ? "" : LocaleController.formatPluralStringSpaced("TonCount", (int) a()) : LocaleController.formatPluralStringSpaced("StarsCount", (int) a());
        }
        int ordinal2 = bVar.ordinal();
        return ordinal2 != 0 ? ordinal2 != 1 ? "" : LocaleController.formatString(R.string.TonCountX, b()) : LocaleController.formatString(R.string.StarsCountX, b());
    }

    public final boolean k() {
        return this.b == 0;
    }

    public final a n(int i10) {
        long j3 = 9 - i10;
        if (j3 <= 0) {
            return this;
        }
        long j10 = 1;
        for (int i11 = 0; i11 < j3; i11++) {
            j10 *= 10;
        }
        return i((this.b / j10) * j10, this.a);
    }

    public final TL_stars.StarsAmount o() {
        b bVar = b.a;
        long j3 = this.b;
        b bVar2 = this.a;
        if (bVar2 == bVar) {
            TL_stars.TL_starsAmount tL_starsAmount = new TL_stars.TL_starsAmount();
            tL_starsAmount.amount = j3 / 1000000000;
            tL_starsAmount.nanos = (int) (j3 % 1000000000);
            return tL_starsAmount;
        }
        if (bVar2 != b.b) {
            return null;
        }
        TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
        tL_starsTonAmount.amount = j3;
        return tL_starsTonAmount;
    }
}
