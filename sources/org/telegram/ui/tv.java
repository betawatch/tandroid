package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ tv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i10 = this.a;
        zx zxVar = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = zxVar.I2;
                if (zxVar.getParentActivity() == null) {
                    break;
                } else {
                    boolean z10 = !arrayList.isEmpty();
                    boolean z11 = true;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        long longValue = ((Long) arrayList.get(i11)).longValue();
                        if (z10 && longValue != zxVar.getUserConfig().e()) {
                            z10 = false;
                        }
                        if (org.telegram.messenger.o5.C(longValue)) {
                            z11 = false;
                        }
                        TLRPC.Chat L0 = zxVar.getMessagesController().L0(Long.valueOf(-longValue));
                        if (L0 != null && !org.telegram.messenger.w3.B(L0)) {
                            z11 = false;
                        }
                    }
                    boolean z12 = zxVar.m4() && zxVar.x3();
                    if (z12) {
                        ArrayList arrayList2 = zxVar.D2;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj = arrayList2.get(i12);
                                i12++;
                                if (((org.telegram.messenger.ff) obj).b()) {
                                    z12 = false;
                                }
                            }
                        }
                    }
                    ArrayList arrayList3 = zxVar.D2;
                    boolean z13 = arrayList3 != null && arrayList3.size() > 1;
                    org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(zxVar, view);
                    H.l(R.drawable.msg_sendfile, org.telegram.messenger.dd.L0(z13 ? 2131745652 : 2131745653, null), new ev(zxVar, 5), z12);
                    H.c(R.drawable.input_notify_off, org.telegram.messenger.dd.L0(2131745600, null), new ev(zxVar, 6), false);
                    H.l(R.drawable.msg_calendar2, org.telegram.messenger.dd.L0(z10 ? 2131745531 : 2131745876, null), new k2.v(26, zxVar, z10), z11);
                    H.Z();
                    break;
                }
                break;
            case 1:
                zx zxVar2 = this.b;
                zxVar2.D4(zxVar2.I2, org.telegram.messenger.at.p1, true, true, null);
                break;
            case 2:
                zxVar.B4(view);
                break;
            default:
                zxVar.getContactsController().B();
                zxVar.W4();
                break;
        }
        return true;
    }
}
