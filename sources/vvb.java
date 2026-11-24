// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vvb extends vz9 {
    public boolean f2;
    public final /* synthetic */ wvb g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvb(wvb wvbVar, wvb wvbVar2, Activity activity) {
        super(wvbVar2, activity, false, null, 3, null);
        this.g2 = wvbVar;
        this.f2 = true;
    }

    @Override // vz9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        wvb wvbVar = this.g2;
        i = ((d) wvbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(z8c.h(i).f0)) {
            hs6 mediaDataController = wvbVar.getMediaDataController();
            i2 = ((d) wvbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(z8c.h(i2).f0);
            if ((o0 == null ? 0L : o0.set.id) == hs6.r0(document)) {
                z = true;
            }
        }
        wvbVar.g0(l, z);
    }

    @Override // vz9, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.r(null);
        }
    }
}
