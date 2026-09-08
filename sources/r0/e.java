package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e implements d, f {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ e() {
    }

    @Override // r0.f
    public ClipData a() {
        return this.b;
    }

    @Override // r0.d
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // r0.d
    public g build() {
        return new g(new e(this));
    }

    @Override // r0.d
    public void c(int i10) {
        this.d = i10;
    }

    @Override // r0.f
    public ContentInfo d() {
        return null;
    }

    @Override // r0.f
    public int e() {
        return this.c;
    }

    @Override // r0.f
    public int k() {
        return this.d;
    }

    @Override // r0.d
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.b.getDescription());
                sb2.append(", source=");
                int i10 = this.c;
                sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i11 = this.d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return a4.a.s(sb2, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.b;
        clipData.getClass();
        this.b = clipData;
        int i10 = eVar.c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.c = i10;
        int i11 = eVar.d;
        if ((i11 & 1) == i11) {
            this.d = i11;
            this.e = eVar.e;
            this.f = eVar.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
