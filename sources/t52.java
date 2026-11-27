// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t52 extends qb0 {
    public final /* synthetic */ u52 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(u52 u52Var, Context context) {
        super(context);
        this.F = u52Var;
    }

    @Override // qb0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.F.w;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(chatAttachAlertPhotoLayout.L0, TLObject.FLAG_30));
    }
}
