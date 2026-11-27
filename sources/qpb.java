// default package

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.Components.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qpb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public int b = 0;
    public final /* synthetic */ pqb c;

    public /* synthetic */ qpb(pqb pqbVar, byte b) {
        this.a = b;
        this.c = pqbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        pqb pqbVar = this.c;
        switch (b) {
            case 0:
                pqbVar.H0.setRotation(this.b);
                this.b -= 45;
                pqbVar.H0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(k43.g).start();
                fqb[] fqbVarArr = pqbVar.y0;
                fqb fqbVar = fqbVarArr[0];
                if (fqbVar != null) {
                    Drawable background = fqbVar.getBackground();
                    if (background instanceof hh7) {
                        ((hh7) background).v(false);
                    } else {
                        ynb ynbVar = pqbVar.w;
                        if (pqbVar.b == 2) {
                            pqbVar.j1 += 45;
                            while (true) {
                                int i = pqbVar.j1;
                                if (i >= 360) {
                                    pqbVar.j1 = i - 360;
                                } else {
                                    pqbVar.f1(pqbVar.b1, 0, true);
                                }
                            }
                        } else if (ynbVar != null) {
                            ynbVar.n += 45;
                            while (true) {
                                int i2 = ynbVar.n;
                                if (i2 >= 360) {
                                    ynbVar.n = i2 - 360;
                                } else {
                                    aob.r1(false, false);
                                }
                            }
                        }
                    }
                }
                fqb fqbVar2 = fqbVarArr[1];
                if (fqbVar2 != null) {
                    Drawable background2 = fqbVar2.getBackground();
                    if (background2 instanceof hh7) {
                        ((hh7) background2).v(false);
                        break;
                    }
                }
                break;
            default:
                mnb mnbVar = pqbVar.T;
                pqbVar.I0.setRotation(this.b);
                this.b -= 45;
                pqbVar.I0.animate().rotationBy(-45.0f).setDuration(300L).setInterpolator(k43.g).start();
                ynb ynbVar2 = pqbVar.w;
                if (!ynbVar2.i) {
                    int i3 = ynbVar2.h;
                    int i4 = ynbVar2.e;
                    if (i3 != 0) {
                        if (i4 == 0) {
                            i4 = ynbVar2.c;
                        }
                        ynbVar2.e = ynbVar2.f;
                        ynbVar2.f = ynbVar2.g;
                        ynbVar2.g = i3;
                        ynbVar2.h = i4;
                        i3 = i4;
                    } else {
                        if (i4 == 0) {
                            i4 = ynbVar2.c;
                        }
                        ynbVar2.e = ynbVar2.f;
                        ynbVar2.f = ynbVar2.g;
                        ynbVar2.g = i4;
                    }
                    pqbVar.X.e(i3, 3);
                    pqbVar.X.e(ynbVar2.g, 2);
                    pqbVar.X.e(ynbVar2.f, 1);
                    p pVar = pqbVar.X;
                    int i5 = ynbVar2.e;
                    if (i5 == 0) {
                        i5 = ynbVar2.c;
                    }
                    pVar.e(i5, 0);
                    pqbVar.M0[1].b(0, ynbVar2.e);
                    pqbVar.M0[1].b(1, ynbVar2.f);
                    pqbVar.M0[1].b(2, ynbVar2.g);
                    pqbVar.M0[1].b(3, ynbVar2.h);
                    aob.r1(true, true);
                    pqbVar.w0.i1();
                    break;
                } else if (mnbVar.j() != null) {
                    mnbVar.j().v(false);
                    break;
                }
                break;
        }
    }
}
