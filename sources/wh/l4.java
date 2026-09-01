package wh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o4 b;

    public /* synthetic */ l4(o4 o4Var, int i10) {
        this.a = i10;
        this.b = o4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final o4 o4Var = this.b;
                ArrayList arrayList = o4Var.B;
                int indexOf = arrayList.indexOf(view);
                if (o4Var.K != null && o4Var.a != null) {
                    List m9 = o4Var.m();
                    if (indexOf >= 0 && indexOf < m9.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m9.get(indexOf);
                        q70 P = o4Var.K.a.e3.P((View) arrayList.get(indexOf));
                        boolean z4 = tVar.n;
                        final int i10 = 0;
                        P.c(z4 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z4 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: wh.m4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.a) != null) {
                                            r3 r3Var = k3Var.a;
                                            r3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = r3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock N3 = r3.N3(aVar3, tVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = tVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = tVar2.n;
                                                }
                                                r3Var.n4(aVar3);
                                                d2 d2Var2 = r3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                r3Var.e3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.a) != null) {
                                            r3.N1(aVar4, tVar, k3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        P.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: wh.m4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        o4 o4Var2 = o4Var;
                                        k3 k3Var = o4Var2.K;
                                        if (k3Var != null && (aVar3 = o4Var2.a) != null) {
                                            r3 r3Var = k3Var.a;
                                            r3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = r3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock N3 = r3.N3(aVar3, tVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = tVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = tVar2.n;
                                                }
                                                r3Var.n4(aVar3);
                                                d2 d2Var2 = r3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                r3Var.e3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        o4 o4Var3 = o4Var;
                                        k3 k3Var2 = o4Var3.K;
                                        if (k3Var2 != null && (aVar4 = o4Var3.a) != null) {
                                            r3.N1(aVar4, tVar, k3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        P.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (o4Var.E) {
                            P.u = false;
                            P.v = true;
                            P.s = 0;
                        }
                        P.Z();
                        break;
                    }
                }
                break;
            case 1:
                o4 o4Var2 = this.b;
                k3 k3Var = o4Var2.K;
                if (k3Var != null && (aVar = o4Var2.a) != null) {
                    r3 r3Var = k3Var.a;
                    r3Var.Y3 = aVar;
                    r3Var.e3.p(0);
                    break;
                }
                break;
            default:
                o4 o4Var3 = this.b;
                k3 k3Var2 = o4Var3.K;
                if (k3Var2 != null && (aVar2 = o4Var3.a) != null) {
                    r3 r3Var2 = k3Var2.a;
                    r3Var2.getClass();
                    if (r3.B3(aVar2.b)) {
                        d2 d2Var = r3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = r3.g3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockcollage.items = g32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (g32 == null) {
                                g32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = g32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        d2 d2Var2 = r3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View z12 = r3Var2.z1(aVar2);
                        if (z12 instanceof o4) {
                            o4 o4Var4 = (o4) z12;
                            ValueAnimator valueAnimator = o4Var4.f0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                o4Var4.f0 = null;
                            }
                            if (o4Var4.getParent() != null) {
                                o4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = o4Var4.e0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                o4Var4.e0 = null;
                            }
                            o4Var4.T = 0;
                            o4Var4.U = 0.0f;
                            o4Var4.o(true);
                            o4Var4.requestLayout();
                            o4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
