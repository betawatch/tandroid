package qh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ i4(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final l4 l4Var = this.b;
                ArrayList arrayList = l4Var.A;
                int indexOf = arrayList.indexOf(view);
                if (l4Var.J != null && l4Var.a != null) {
                    List m10 = l4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) m10.get(indexOf);
                        x60 J1 = l4Var.J.a.d3.J1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.n;
                        final int i9 = 0;
                        J1.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: qh.j4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i9) {
                                    case 0:
                                        l4 l4Var2 = l4Var;
                                        h3 h3Var = l4Var2.J;
                                        if (h3Var != null && (aVar3 = l4Var2.a) != null) {
                                            o3 o3Var = h3Var.a;
                                            o3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = o3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock N3 = o3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.n;
                                                }
                                                o3Var.n4(aVar3);
                                                b2 b2Var2 = o3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                o3Var.d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        l4 l4Var3 = l4Var;
                                        h3 h3Var2 = l4Var3.J;
                                        if (h3Var2 != null && (aVar4 = l4Var3.a) != null) {
                                            o3.N1(aVar4, sVar, h3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i10 = 1;
                        J1.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: qh.j4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        l4 l4Var2 = l4Var;
                                        h3 h3Var = l4Var2.J;
                                        if (h3Var != null && (aVar3 = l4Var2.a) != null) {
                                            o3 o3Var = h3Var.a;
                                            o3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = o3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock N3 = o3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.n;
                                                }
                                                o3Var.n4(aVar3);
                                                b2 b2Var2 = o3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                o3Var.d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        l4 l4Var3 = l4Var;
                                        h3 h3Var2 = l4Var3.J;
                                        if (h3Var2 != null && (aVar4 = l4Var3.a) != null) {
                                            o3.N1(aVar4, sVar, h3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        J1.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (l4Var.D) {
                            J1.u = false;
                            J1.v = true;
                            J1.s = 0;
                        }
                        J1.Z();
                        break;
                    }
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                h3 h3Var = l4Var2.J;
                if (h3Var != null && (aVar = l4Var2.a) != null) {
                    o3 o3Var = h3Var.a;
                    o3Var.X3 = aVar;
                    o3Var.d3.c0(0);
                    break;
                }
                break;
            default:
                l4 l4Var3 = this.b;
                h3 h3Var2 = l4Var3.J;
                if (h3Var2 != null && (aVar2 = l4Var3.a) != null) {
                    o3 o3Var2 = h3Var2.a;
                    o3Var2.getClass();
                    if (o3.B3(aVar2.b)) {
                        b2 b2Var = o3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = o3.g3(aVar2.b);
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
                        b2 b2Var2 = o3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        View z12 = o3Var2.z1(aVar2);
                        if (z12 instanceof l4) {
                            l4 l4Var4 = (l4) z12;
                            ValueAnimator valueAnimator = l4Var4.e0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                l4Var4.e0 = null;
                            }
                            if (l4Var4.getParent() != null) {
                                l4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = l4Var4.d0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                l4Var4.d0 = null;
                            }
                            l4Var4.S = 0;
                            l4Var4.T = 0.0f;
                            l4Var4.o(true);
                            l4Var4.requestLayout();
                            l4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
