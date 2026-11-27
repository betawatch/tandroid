// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
