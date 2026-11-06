package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public void c(int i7) {
        this.d = i7;
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
    public int l() {
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
                int i7 = this.c;
                sb2.append(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return a8.p0.s(sb2, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.b;
        clipData.getClass();
        this.b = clipData;
        int i7 = eVar.c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.c = i7;
        int i10 = eVar.d;
        if ((i10 & 1) == i10) {
            this.d = i10;
            this.e = eVar.e;
            this.f = eVar.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
