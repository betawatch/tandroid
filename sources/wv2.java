// default package

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class wv2 implements xv2 {
    public final ContentInfo.Builder a;

    public wv2(ClipData clipData, int i) {
        this.a = vv2.a(clipData, i);
    }

    @Override // xv2
    public final bw2 build() {
        return new bw2(new zv2(this.a.build()));
    }

    @Override // xv2
    public final void c(Uri uri) {
        this.a.setLinkUri(uri);
    }

    @Override // xv2
    public final void d(int i) {
        this.a.setFlags(i);
    }

    @Override // xv2
    public final void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }
}
