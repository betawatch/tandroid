// default package

import android.os.Bundle;
import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u64 extends Exception {
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String w;
    public static final String x;
    public static final String y;
    public final int a;
    public final long b;
    public final Bundle c;
    public final byte d;
    public final String e;
    public final int f;
    public final go4 h;
    public final int n;
    public final rz6 r;
    public final boolean s;

    static {
        String str = hac.a;
        w = "0";
        x = "1";
        y = "2";
        E = "3";
        F = "4";
        G = "5";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u64(int i, Throwable th, int i2, String str, int i3, go4 go4Var, int i4, rz6 rz6Var, boolean z) {
        this(r0, th, i2, i, r5, r6, r7, i4, rz6Var, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        go4 go4Var2;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            go4Var2 = go4Var;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            go4Var2 = go4Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            go4Var2 = go4Var;
            sb.append(go4Var2);
            sb.append(", format_supported=");
            String str5 = hac.a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    rjb.h();
                    throw null;
                }
                str4 = "YES";
            }
            sb.append(str4);
            str3 = sb.toString();
        }
    }

    public final u64 a(rz6 rz6Var) {
        String message = getMessage();
        String str = hac.a;
        return new u64(message, getCause(), this.a, this.d, this.e, this.f, this.h, this.n, rz6Var, this.b, this.s);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u64(String str, Throwable th, int i, int i2, String str2, int i3, go4 go4Var, int i4, rz6 rz6Var, long j, boolean z) {
        super(str, th);
        Bundle bundle = Bundle.EMPTY;
        Bundle bundle2 = Bundle.EMPTY;
        this.a = i;
        this.c = bundle2;
        this.b = j;
        jte.f(!z || i2 == 1);
        jte.f(th != null || i2 == 3);
        this.d = i2;
        this.e = str2;
        this.f = i3;
        this.h = go4Var;
        this.n = i4;
        this.r = rz6Var;
        this.s = z;
    }

    public u64(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
