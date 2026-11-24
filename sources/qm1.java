// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qm1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    public /* synthetic */ qm1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                v67 v67Var = (v67) obj;
                yv1 yv1Var2 = this.b;
                yv1Var2.y5 = v67Var;
                yv1Var2.H5.k.suggested_post = v67Var.c();
                yv1Var2.ac(true, null, yv1Var2.H5, null, null, true, 0, null, false, 0L, null, true);
                break;
            case 1:
            case 9:
                yv1Var.fc((v67) obj);
                break;
            case 2:
                yv1Var.Wb(true, false);
                if (((Boolean) obj).booleanValue()) {
                    yv1Var.finishFragment();
                    break;
                }
                break;
            case 3:
                yv1Var.sa((String) obj, false);
                break;
            case 4:
                yv1Var.T1 = (vh1) obj;
                break;
            case 5:
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    yv1Var.S1 = tL_premium_boostsStatus;
                    yv1Var.getMessagesController().F0().b(yv1Var.l6, tL_premium_boostsStatus, new qm1(yv1Var, (byte) 4));
                    break;
                }
                break;
            case 6:
                View view = (View) obj;
                if (!(view instanceof rc2)) {
                    if (!(view instanceof cm1)) {
                        if (!(view instanceof vf2)) {
                            if (!(view instanceof op0)) {
                                if (view instanceof er0) {
                                    view.invalidate();
                                    break;
                                }
                            } else {
                                view.invalidate();
                                break;
                            }
                        } else {
                            ((vf2) view).getTextView().setTranslationX(yv1Var.o7() / 2.0f);
                            break;
                        }
                    } else {
                        cm1 cm1Var = (cm1) view;
                        cm1Var.f0 = yv1Var.S7();
                        cm1Var.j0 = yv1Var.f8();
                        yv1Var.e8();
                        yv1Var.n7();
                        int o7 = yv1Var.o7();
                        if (cm1Var.k0 != o7) {
                            cm1Var.k0 = o7;
                            cm1Var.invalidate();
                            break;
                        }
                    }
                } else {
                    rc2 rc2Var = (rc2) view;
                    rc2Var.W6 = yv1Var.S7();
                    rc2Var.X6 = yv1Var.f8();
                    boolean e8 = yv1Var.e8();
                    if (rc2Var.Y6 != e8) {
                        rc2Var.Y6 = e8;
                        yv1Var.A0.getClass();
                        int R = RecyclerView.R(view);
                        rc2Var.F6 = true;
                        rc2Var.forceLayout();
                        if (R >= 0) {
                            yv1Var.D0.g(R);
                        }
                    }
                    rc2Var.Z6 = yv1Var.n7();
                    int o72 = yv1Var.o7();
                    if (rc2Var.a7 != o72) {
                        rc2Var.a7 = o72;
                        rc2Var.d4();
                        rc2Var.invalidate();
                        break;
                    }
                }
                break;
            case 7:
                Long l = (Long) obj;
                mzb mzbVar = yv1Var.g2;
                if (mzbVar != null) {
                    mzbVar.k(l.longValue(), true);
                    break;
                }
                break;
            case 8:
                yv1Var.f0.c.add(((r7) obj).getIconView());
                break;
            case 10:
                int intValue = ((Integer) obj).intValue();
                int i = yv1.xd;
                yv1Var.Ta(intValue);
                break;
            default:
                int intValue2 = ((Integer) obj).intValue();
                int i2 = yv1.xd;
                yv1Var.Ta(intValue2);
                break;
        }
    }
}
