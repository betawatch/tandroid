package r0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements e, g {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public d(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.b = contentInfo;
    }

    @Override // r0.g
    public ClipData a() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // r0.e
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // r0.e
    public h build() {
        return new h(new d(((ContentInfo.Builder) this.b).build()));
    }

    @Override // r0.e
    public void c(int i10) {
        ((ContentInfo.Builder) this.b).setFlags(i10);
    }

    @Override // r0.g
    public ContentInfo d() {
        return (ContentInfo) this.b;
    }

    @Override // r0.g
    public int e() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // r0.g
    public int f() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // r0.e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public d(ClipData clipData, int i10) {
        this.b = c.a(clipData, i10);
    }
}
