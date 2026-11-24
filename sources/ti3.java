// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ti3 extends ChatActivityEnterView {
    public final /* synthetic */ nk3 A7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti3(nk3 nk3Var, Activity activity, gk3 gk3Var) {
        super(activity, gk3Var, null, false, null);
        this.A7 = nk3Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void c1(float f) {
        nk3 nk3Var = this.A7;
        nk3Var.A1.setInputBubbleHeight(f);
        nk3Var.O2();
        nk3Var.P2();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getAction() == 0) {
            nk3 nk3Var = this.A7;
            Activity parentActivity = nk3Var.getParentActivity();
            i = ((d) nk3Var).classGuid;
            gm.V2(parentActivity, i);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        nk3 nk3Var = this.A7;
        int i = nk3Var.U0;
        ti3 ti3Var = nk3Var.D1;
        return Math.max(1, i + (!TextUtils.isEmpty(ti3Var == null ? "" : ti3Var.getFieldText()) ? 1 : 0));
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        nk3 nk3Var = this.A7;
        ArrayList arrayList = nk3Var.K2;
        if (arrayList == null) {
            return 0L;
        }
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            long L1 = nk3Var.getMessagesController().L1(longValue);
            if (L1 <= 0 && longValue > 0) {
                L1 = pg3.j(nk3Var.getMessagesController().L2(longValue));
            }
            j += L1;
        }
        return j;
    }
}
