package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ww0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t4 extends org.telegram.ui.Cells.d3 {
    public final /* synthetic */ int E;
    public final /* synthetic */ y4 F;
    public final /* synthetic */ eh.f y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(y4 y4Var, Context context, ww0 ww0Var, String str, int i10, u6 u6Var, eh.f fVar, int i11) {
        super(context, ww0Var, str, true, i10, u6Var);
        this.F = y4Var;
        this.y = fVar;
        this.E = i11;
    }

    @Override // org.telegram.ui.Cells.d3
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        y4 y4Var = this.F;
        MessageObject messageObject = y4Var.m0;
        TLRPC.MessageAction messageAction = y4Var.l0;
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
        CharSequence[] charSequenceArr = {y4Var.t0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.E).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        y4Var.k0.X(messageObject, true);
        y4Var.u0.O(true);
        y4Var.Z(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        eh.f fVar = this.y;
        fVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.d3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
