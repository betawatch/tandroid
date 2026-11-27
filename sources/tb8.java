// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tb8 extends kea {
    public final /* synthetic */ FrameLayout U2;
    public final /* synthetic */ boolean V2;
    public final /* synthetic */ PhotoViewer W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb8(PhotoViewer photoViewer, Context context, zu1 zu1Var, ArrayList arrayList, String str, Integer num, FrameLayout frameLayout, boolean z) {
        super(context, zu1Var, arrayList, null, null, false, str, null, false, true, false, num, null);
        this.W2 = photoViewer;
        this.U2 = frameLayout;
        this.V2 = z;
    }

    @Override // kea, nx0
    public final void H() {
        super.H();
        if (this.V2) {
            hl.d3(new x38(this, (byte) 12), 50L);
        }
        Drawable[] drawableArr = PhotoViewer.d9;
        PhotoViewer photoViewer = this.W2;
        photoViewer.e0.softInputMode = jn7.u4;
        try {
            ((WindowManager) photoViewer.E.getSystemService("window")).updateViewLayout(photoViewer.h0, photoViewer.e0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            hl.d3(new y36((Object) this, (Object) this.U2, (Object) zh6Var, i, (byte) 20), 250L);
        }
    }
}
