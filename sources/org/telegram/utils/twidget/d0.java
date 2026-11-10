package org.telegram.utils.twidget;

import android.os.SystemClock;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class d0 {
    public static final String[] m = {"t.me", "telegram.me", "telegram.dog"};
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public int d;
    public int e;
    public boolean i;
    public boolean j;
    public int l;
    public long f = -4611686018427387904L;
    public long g = -4611686018427387904L;
    public long h = -4611686018427387904L;
    public final long[] k = new long[10];

    public d0(JSONObject jSONObject) {
        boolean z9 = false;
        boolean z10 = (jSONObject == null || (jSONObject != null && jSONObject.optBoolean("preview")) || !jSONObject.optBoolean("canQuery")) ? false : true;
        this.a = z10;
        this.b = z10 && jSONObject.optBoolean("backgroundQuery");
        if (z10 && jSONObject.has("wallet") && !jSONObject.isNull("wallet")) {
            z9 = true;
        }
        this.c = z9;
    }

    public final synchronized boolean a(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9) {
            long[] jArr = this.k;
            int i7 = this.l;
            if (elapsedRealtime - jArr[i7] >= 1000) {
                jArr[i7] = elapsedRealtime;
                this.l = (i7 + 1) % jArr.length;
                return true;
            }
        }
        return false;
    }

    public final boolean b(long j3) {
        return this.e < this.d && j3 - this.f <= 10000;
    }

    public final synchronized boolean c(boolean z9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z9 && b(elapsedRealtime)) {
            this.e = this.d;
            return true;
        }
        return false;
    }

    public final synchronized boolean d(String str, boolean z9, boolean z10) {
        try {
            if (this.a && !this.i && str != null && str.getBytes(StandardCharsets.UTF_8).length <= 64 && (!z9 || this.c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (!z10 || !b(elapsedRealtime)) {
                    if (this.b && !z9 && elapsedRealtime - this.g >= 1000) {
                        this.g = elapsedRealtime;
                    }
                    return false;
                }
                this.e = this.d;
                this.j = z9;
                this.i = true;
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized boolean e(String str, boolean z9) {
        try {
            if (this.c && !this.i && str != null && str.length() <= 262144 && z9) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (b(elapsedRealtime)) {
                    this.e = this.d;
                } else if (elapsedRealtime - this.h > 10000) {
                    return false;
                }
                this.i = true;
                return true;
            }
            return false;
        } finally {
        }
    }
}
