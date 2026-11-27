// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class vxb extends n1a {
    public boolean f2;
    public final /* synthetic */ wxb g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxb(wxb wxbVar, wxb wxbVar2, Activity activity) {
        super(wxbVar2, activity, false, null, 3, null);
        this.g2 = wxbVar;
        this.f2 = true;
    }

    @Override // n1a
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        wxb wxbVar = this.g2;
        i = ((e) wxbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(yac.h(i).f0)) {
            ls6 mediaDataController = wxbVar.getMediaDataController();
            i2 = ((e) wxbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(yac.h(i2).f0);
            if ((o0 == null ? 0L : o0.set.id) == ls6.r0(document)) {
                z = true;
            }
        }
        wxbVar.f0(l, z);
    }

    @Override // n1a, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.r(null);
        }
    }
}
