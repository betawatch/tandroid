// default package

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pw2 implements qw2 {
    public final ContentInfo a;

    public pw2(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // qw2
    public final int a() {
        return this.a.getFlags();
    }

    @Override // qw2
    public final ClipData b() {
        return this.a.getClip();
    }

    @Override // qw2
    public final ContentInfo e() {
        return this.a;
    }

    @Override // qw2
    public final int f() {
        return this.a.getSource();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
