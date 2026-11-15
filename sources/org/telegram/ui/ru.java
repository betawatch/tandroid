package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ ru(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        yw ywVar = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = ywVar.K2;
                if (ywVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        long longValue = ((Long) arrayList.get(i10)).longValue();
                        if (z10 && longValue != ywVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.m5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat M0 = ywVar.getMessagesController().M0(Long.valueOf(-longValue));
                        if (M0 != null && !org.telegram.messenger.t3.B(M0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = ywVar.m4() && ywVar.x3();
                    if (z12) {
                        ArrayList arrayList2 = ywVar.F2;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj = arrayList2.get(i11);
                                i11++;
                                if (((org.telegram.messenger.ff) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = ywVar.F2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(ywVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.hd.M0(z13 ? 2131745635 : 2131745636, null), new eu(ywVar, 5), z12);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new eu(ywVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(z10 ? 2131745514 : 2131745859, null), new org.telegram.ui.Components.fp0(7, ywVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                yw ywVar2 = this.b;
                ywVar2.D4(ywVar2.K2, org.telegram.messenger.ns.p1, true, true, null);
                break;
            case 2:
                ywVar.B4(view);
                break;
            default:
                ywVar.getContactsController().B();
                ywVar.W4();
                break;
        }
        return true;
    }
}
