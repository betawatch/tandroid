package xh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.aw0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class u4 extends org.telegram.ui.Cells.g3 {
    public final /* synthetic */ z4 E;
    public final /* synthetic */ ch.f x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(z4 z4Var, Context context, aw0 aw0Var, String str, int i10, d6 d6Var, ch.f fVar, int i11) {
        super(context, aw0Var, str, true, i10, d6Var);
        this.E = z4Var;
        this.x = fVar;
        this.y = i11;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        z4 z4Var = this.E;
        MessageObject messageObject = z4Var.m0;
        TLRPC.MessageAction messageAction = z4Var.l0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else {
            if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
                return;
            }
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        }
        CharSequence[] charSequenceArr = {z4Var.s0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        z4Var.k0.U(messageObject, true);
        z4Var.t0.N(true);
        z4Var.Z(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        ch.f fVar = this.x;
        fVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.g3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
