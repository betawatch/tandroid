// default package

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uda implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nha b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ uda(nha nhaVar, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = nhaVar;
        this.c = tL_error;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nha nhaVar = this.b;
                nm7.f(nhaVar.y1.getCurrentAccount()).d(new uda(nhaVar, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            default:
                nha nhaVar2 = this.b;
                cha[] chaVarArr = nhaVar2.w1;
                if (this.c == null) {
                    int i = this.e;
                    cha chaVar = chaVarArr[i];
                    if (this.d == chaVar.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        chaVar.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i3);
                            int i4 = tL_searchResultPosition.date;
                            if (i4 != 0) {
                                nga ngaVar = new nga();
                                ngaVar.c = i4;
                                ngaVar.d = tL_searchResultPosition.msg_id;
                                ngaVar.b = tL_searchResultPosition.offset;
                                ngaVar.a = jb6.e0(i4, true);
                                chaVarArr[i].e.add(ngaVar);
                            }
                        }
                        Collections.sort(chaVarArr[i].e, new qx7((byte) 26));
                        cha chaVar2 = chaVarArr[i];
                        chaVar2.f[0] = tL_messages_searchResultsPositions.count;
                        chaVar2.h = true;
                        if (!chaVar2.e.isEmpty()) {
                            while (true) {
                                iga[] igaVarArr = nhaVar2.n0;
                                if (i2 < igaVarArr.length) {
                                    iga igaVar = igaVarArr[i2];
                                    if (igaVar.F == i) {
                                        igaVar.b = true;
                                        nhaVar2.D1(igaVar, true);
                                    }
                                    i2++;
                                }
                            }
                        }
                        nhaVar2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
