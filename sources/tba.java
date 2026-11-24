// default package

import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tba implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLObject f;

    public /* synthetic */ tba(nfa nfaVar, TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject, byte b) {
        this.a = b;
        this.b = nfaVar;
        this.c = tL_error;
        this.d = i;
        this.e = i2;
        this.f = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nfa nfaVar = this.b;
                kk7.f(nfaVar.y1.getCurrentAccount()).d(new tba(nfaVar, this.c, this.d, this.e, this.f, (byte) 1));
                break;
            default:
                nfa nfaVar2 = this.b;
                cfa[] cfaVarArr = nfaVar2.w1;
                if (this.c == null) {
                    int i = this.e;
                    cfa cfaVar = cfaVarArr[i];
                    if (this.d == cfaVar.p) {
                        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) this.f;
                        cfaVar.e.clear();
                        int size = tL_messages_searchResultsPositions.positions.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i3);
                            int i4 = tL_searchResultPosition.date;
                            if (i4 != 0) {
                                nea neaVar = new nea();
                                neaVar.c = i4;
                                neaVar.d = tL_searchResultPosition.msg_id;
                                neaVar.b = tL_searchResultPosition.offset;
                                neaVar.a = k96.e0(i4, true);
                                cfaVarArr[i].e.add(neaVar);
                            }
                        }
                        Collections.sort(cfaVarArr[i].e, new fx7((byte) 25));
                        cfa cfaVar2 = cfaVarArr[i];
                        cfaVar2.f[0] = tL_messages_searchResultsPositions.count;
                        cfaVar2.h = true;
                        if (!cfaVar2.e.isEmpty()) {
                            while (true) {
                                iea[] ieaVarArr = nfaVar2.n0;
                                if (i2 < ieaVarArr.length) {
                                    iea ieaVar = ieaVarArr[i2];
                                    if (ieaVar.F == i) {
                                        ieaVar.b = true;
                                        nfaVar2.D1(ieaVar, true);
                                    }
                                    i2++;
                                }
                            }
                        }
                        nfaVar2.K.f();
                        break;
                    }
                }
                break;
        }
    }
}
