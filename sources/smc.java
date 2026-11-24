// default package

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class smc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ goc b;

    public /* synthetic */ smc(goc gocVar, byte b) {
        this.a = b;
        this.b = gocVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                gocVar.E0.setClickable(!bool.booleanValue());
                gocVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    gocVar.f0 = 1;
                    gocVar.s0.setPosition(1);
                    gocVar.s0.post(new pmc(gocVar, b2));
                    break;
                }
                break;
            case 1:
                gocVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q7c[] q7cVarArr = gocVar.u0;
                q7c q7cVar = q7cVarArr[1];
                if (q7cVar != null) {
                    goc.d1(q7cVar, true);
                    q7cVarArr[1].w0(0);
                    q7cVarArr[1].post(new pmc(gocVar, b2));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (gocVar.D0 != floatValue) {
                    gocVar.D0 = floatValue;
                    float x = aq1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i = 0;
                    while (true) {
                        int childCount = gocVar.C0.getChildCount();
                        qmb qmbVar = gocVar.C0;
                        if (i >= childCount) {
                            qmbVar.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                            gocVar.C0.requestLayout();
                            break;
                        } else {
                            View childAt = qmbVar.getChildAt(i);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i++;
                        }
                    }
                }
                break;
            case 3:
                gocVar.F0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!gocVar.isFinished) {
                    if (user != null) {
                        gocVar.presentFragment(new rrc(user));
                        break;
                    } else {
                        gm.c3(new pmc(gocVar, (byte) 9));
                        break;
                    }
                }
                break;
        }
    }
}
