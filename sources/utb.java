// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class utb extends tx9 {
    public boolean f2;
    public final /* synthetic */ vtb g2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utb(vtb vtbVar, vtb vtbVar2, Activity activity) {
        super(vtbVar2, activity, false, null, 3, null);
        this.g2 = vtbVar;
        this.f2 = true;
    }

    @Override // tx9
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        vtb vtbVar = this.g2;
        i = ((d) vtbVar).currentAccount;
        boolean z = false;
        if (!TextUtils.isEmpty(y6c.h(i).f0)) {
            hq6 mediaDataController = vtbVar.getMediaDataController();
            i2 = ((d) vtbVar).currentAccount;
            TLRPC.TL_messages_stickerSet o0 = mediaDataController.o0(y6c.h(i2).f0);
            if ((o0 == null ? 0L : o0.set.id) == hq6.r0(document)) {
                z = true;
            }
        }
        vtbVar.f0(l, z);
    }

    @Override // tx9, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2) {
            this.f2 = false;
            this.g2.f.r(null);
        }
    }
}
