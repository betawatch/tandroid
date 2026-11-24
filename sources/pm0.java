// default package

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm0 implements fn7, yz8, ed {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pm0(int i, boolean[] zArr, TLRPC.Document document, int i2, boolean[] zArr2, p8c p8cVar) {
        this.a = i;
        this.c = zArr;
        this.d = document;
        this.b = i2;
        this.e = zArr2;
        this.f = p8cVar;
    }

    @Override // fn7
    public final void i(hn7 hn7Var, int i) {
        ji jiVar = (ji) this.c;
        wm0 wm0Var = (wm0) this.d;
        xm0 xm0Var = (xm0) this.e;
        hn7 hn7Var2 = (hn7) this.f;
        try {
            jiVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (hn7Var.getTag() != null && hn7Var.getTag().equals("DAY")) {
            if (hn7Var.getValue() == hn7Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i2 = calendar.get(11);
                int i3 = (calendar.get(12) / 5) + 1;
                if (i3 > 11) {
                    if (i2 == 23) {
                        hn7Var.setMinValue(hn7Var.getMinValue() + 1);
                        wm0Var.setMinValue(0);
                    } else {
                        wm0Var.setMinValue(i2 + 1);
                    }
                    xm0Var.setMinValue(0);
                } else {
                    wm0Var.setMinValue(i2);
                    xm0Var.setMinValue(i3);
                }
            } else if (hn7Var.getValue() == hn7Var.getMaxValue()) {
                wm0Var.setMaxValue(this.a);
                xm0Var.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                wm0Var.setMinValue(0);
                xm0Var.setMinValue(0);
                wm0Var.setMaxValue(23);
                xm0Var.setMaxValue(11);
            }
        }
        if (hn7Var.getTag() != null && hn7Var.getTag().equals("HOUR") && hn7Var2.getValue() == hn7Var2.getMinValue()) {
            if (hn7Var.getValue() != hn7Var.getMinValue()) {
                xm0Var.setMinValue(0);
                xm0Var.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i4 = (calendar2.get(12) / 5) + 1;
            if (i4 > 11) {
                xm0Var.setMinValue(0);
            } else {
                xm0Var.setMinValue(i4);
            }
        }
    }

    @Override // yz8
    public final void k(a09 a09Var, int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        gec gecVar = (gec) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i2 = this.b + i;
        int i3 = this.a;
        sparseIntArray.put(i3, i2);
        if (gecVar.getCurrentItem() == i3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i2, true);
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        p8c p8cVar = (p8c) this.f;
        int i2 = this.a;
        if (!y6c.h(i2).p()) {
            new jh8((d) new u8a(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.id;
        int i3 = this.b;
        if (i3 > 0) {
            tL_emojiStatus.flags |= 1;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i2).getCurrentTime() + i3;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i2).sendRequest(updateemojistatus, new ae(zArr2, p8cVar, i2, updateemojistatus, (byte) 8));
    }

    public /* synthetic */ pm0(ji jiVar, wm0 wm0Var, xm0 xm0Var, int i, int i2, hn7 hn7Var) {
        this.c = jiVar;
        this.d = wm0Var;
        this.e = xm0Var;
        this.a = i;
        this.b = i2;
        this.f = hn7Var;
    }

    public /* synthetic */ pm0(SparseIntArray sparseIntArray, int i, int i2, gec gecVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i;
        this.b = i2;
        this.d = gecVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }
}
