// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class se1 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nf1 b;

    public /* synthetic */ se1(nf1 nf1Var, byte b) {
        this.a = b;
        this.b = nf1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 0;
        final nf1 nf1Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults = (TLRPC.TL_channels_adminLogResults) tLObject;
                    final byte b3 = 1;
                    gl.c3(new Runnable() { // from class: qe1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b3;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = tL_channels_adminLogResults;
                            nf1 nf1Var2 = nf1Var;
                            switch (b4) {
                                case 0:
                                    nf1Var2.U0(tL_channels_adminLogResults2);
                                    break;
                                default:
                                    nf1Var2.V0(tL_channels_adminLogResults2);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case 1:
                nf1Var.getClass();
                if (tLObject instanceof Vector) {
                    ArrayList<T> arrayList = ((Vector) tLObject).objects;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof TLRPC.User) {
                            arrayList2.add((TLRPC.User) arrayList.get(i));
                        }
                    }
                    nf1Var.getMessagesController().b4(arrayList2, false);
                    break;
                }
                break;
            case 2:
                nf1Var.getClass();
                gl.c3(new q21(nf1Var, tLObject, (byte) 19));
                break;
            case 3:
                if (tLObject != null) {
                    final TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults2 = (TLRPC.TL_channels_adminLogResults) tLObject;
                    gl.c3(new Runnable() { // from class: qe1
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b4 = b2;
                            TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults22 = tL_channels_adminLogResults2;
                            nf1 nf1Var2 = nf1Var;
                            switch (b4) {
                                case 0:
                                    nf1Var2.U0(tL_channels_adminLogResults22);
                                    break;
                                default:
                                    nf1Var2.V0(tL_channels_adminLogResults22);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                gl.c3(new fv0((Object) nf1Var, (Object) tL_error, (Object) tLObject, (byte) 15));
                break;
        }
    }
}
