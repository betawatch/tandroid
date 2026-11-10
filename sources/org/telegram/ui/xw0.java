package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xw0 {
    public final String a;
    public final Runnable b;
    public final String c;
    public final String[] d;
    public final int e;
    public final int f;
    public int g;
    public String h;

    public xw0(int i7, String str, int i10, Runnable runnable) {
        this(i7, str, null, null, null, i10, runnable);
    }

    public final void a(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xw0) && this.f == ((xw0) obj).f;
    }

    public final String toString() {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(this.g);
        serializedData.writeInt32(1);
        serializedData.writeInt32(this.f);
        return Utilities.f(serializedData.toByteArray());
    }

    public xw0(int i7, String str, String str2, int i10, Runnable runnable) {
        this(i7, str, null, str2, null, i10, runnable);
    }

    public xw0(int i7, String str, String str2, String str3, int i10, Runnable runnable) {
        this(i7, str, str2, str3, null, i10, runnable);
    }

    public xw0(int i7, String str, String str2, String str3, String str4, int i10, Runnable runnable) {
        this.f = i7;
        this.a = str;
        this.c = str2;
        this.b = runnable;
        this.e = i10;
        if (str3 != null && str4 != null) {
            this.d = new String[]{str3, str4};
        } else if (str3 != null) {
            this.d = new String[]{str3};
        }
    }
}
