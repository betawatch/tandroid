package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f implements e, g {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ f() {
    }

    @Override // r0.g
    public ClipData a() {
        return this.b;
    }

    @Override // r0.e
    public void b(Uri uri) {
        this.e = uri;
    }

    @Override // r0.e
    public h build() {
        return new h(new f(this));
    }

    @Override // r0.e
    public void c(int i9) {
        this.d = i9;
    }

    @Override // r0.g
    public ContentInfo d() {
        return null;
    }

    @Override // r0.g
    public int e() {
        return this.c;
    }

    @Override // r0.g
    public int f() {
        return this.d;
    }

    @Override // r0.e
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
                int i9 = this.c;
                sb2.append(i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? String.valueOf(i9) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return aa.d.r(sb2, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public f(f fVar) {
        ClipData clipData = fVar.b;
        clipData.getClass();
        this.b = clipData;
        int i9 = fVar.c;
        if (i9 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i9 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.c = i9;
        int i10 = fVar.d;
        if ((i10 & 1) == i10) {
            this.d = i10;
            this.e = fVar.e;
            this.f = fVar.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
