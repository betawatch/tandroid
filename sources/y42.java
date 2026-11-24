// default package

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y42 extends u26 {
    public final /* synthetic */ ar0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y42(ar0 ar0Var, Context context) {
        super(context);
        this.r = ar0Var;
    }

    @Override // u26
    public final int k(int i, View view) {
        int topScrollOffset;
        int k = super.k(i, view);
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.r.R;
        int paddingTop = chatAttachAlertPhotoLayout.F.getPaddingTop();
        topScrollOffset = chatAttachAlertPhotoLayout.getTopScrollOffset();
        return k - (paddingTop - topScrollOffset);
    }

    @Override // u26
    public final int m(int i) {
        return super.m(i) << 1;
    }
}
