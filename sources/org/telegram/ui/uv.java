package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay b;

    public /* synthetic */ uv(ay ayVar, int i10) {
        this.a = i10;
        this.b = ayVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        ay ayVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = ayVar.I2;
                if (ayVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        long longValue = ((Long) arrayList.get(i11)).longValue();
                        if (z10 && longValue != ayVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.o5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat L0 = ayVar.getMessagesController().L0(Long.valueOf(-longValue));
                        if (L0 != null && !org.telegram.messenger.w3.B(L0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = ayVar.l4() && ayVar.w3();
                    if (z12) {
                        ArrayList arrayList2 = ayVar.D2;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                if (((org.telegram.messenger.ef) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = ayVar.D2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(ayVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.cd.L0(z13 ? 2131745652 : 2131745653, null), new fv(ayVar, 5), z12);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new fv(ayVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(z10 ? 2131745531 : 2131745876, null), new k2.v(26, ayVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                ay ayVar2 = this.b;
                ayVar2.C4(ayVar2.I2, org.telegram.messenger.zs.p1, true, true, null);
                break;
            case 2:
                ayVar.A4(view);
                break;
            default:
                ayVar.getContactsController().B();
                ayVar.V4();
                break;
        }
        return true;
    }
}
