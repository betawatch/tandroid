package rh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ j4(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final m4 m4Var = this.b;
                ArrayList arrayList = m4Var.A;
                int indexOf = arrayList.indexOf(view);
                if (m4Var.J != null && m4Var.a != null) {
                    List m10 = m4Var.m();
                    if (indexOf >= 0 && indexOf < m10.size() && indexOf < arrayList.size()) {
                        final s sVar = (s) m10.get(indexOf);
                        b70 A1 = m4Var.J.a.d3.A1((View) arrayList.get(indexOf));
                        boolean z10 = sVar.n;
                        final int i10 = 0;
                        A1.c(z10 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z10 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: rh.k4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.a) != null) {
                                            p3 p3Var = i3Var.a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock N3 = p3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        A1.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: rh.k4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        m4 m4Var2 = m4Var;
                                        i3 i3Var = m4Var2.J;
                                        if (i3Var != null && (aVar3 = m4Var2.a) != null) {
                                            p3 p3Var = i3Var.a;
                                            p3Var.getClass();
                                            s sVar2 = sVar;
                                            if (sVar2 != null) {
                                                b2 b2Var = p3Var.F3;
                                                if (b2Var != null) {
                                                    b2Var.d();
                                                }
                                                sVar2.n = !sVar2.n;
                                                TL_iv.PageBlock N3 = p3.N3(aVar3, sVar2);
                                                if (N3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) N3).spoiler = sVar2.n;
                                                } else if (N3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) N3).spoiler = sVar2.n;
                                                }
                                                p3Var.n4(aVar3);
                                                b2 b2Var2 = p3Var.F3;
                                                if (b2Var2 != null) {
                                                    b2Var2.h();
                                                }
                                                p3Var.d3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        m4 m4Var3 = m4Var;
                                        i3 i3Var2 = m4Var3.J;
                                        if (i3Var2 != null && (aVar4 = m4Var3.a) != null) {
                                            p3.N1(aVar4, sVar, i3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        A1.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (m4Var.D) {
                            A1.u = false;
                            A1.v = true;
                            A1.s = 0;
                        }
                        A1.Z();
                        break;
                    }
                }
                break;
            case 1:
                m4 m4Var2 = this.b;
                i3 i3Var = m4Var2.J;
                if (i3Var != null && (aVar = m4Var2.a) != null) {
                    p3 p3Var = i3Var.a;
                    p3Var.X3 = aVar;
                    p3Var.d3.c0(0);
                    break;
                }
                break;
            default:
                m4 m4Var3 = this.b;
                i3 i3Var2 = m4Var3.J;
                if (i3Var2 != null && (aVar2 = m4Var3.a) != null) {
                    p3 p3Var2 = i3Var2.a;
                    p3Var2.getClass();
                    if (p3.B3(aVar2.b)) {
                        b2 b2Var = p3Var2.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> g32 = p3.g3(aVar2.b);
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
                        b2 b2Var2 = p3Var2.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        View z12 = p3Var2.z1(aVar2);
                        if (z12 instanceof m4) {
                            m4 m4Var4 = (m4) z12;
                            ValueAnimator valueAnimator = m4Var4.e0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                m4Var4.e0 = null;
                            }
                            if (m4Var4.getParent() != null) {
                                m4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = m4Var4.d0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                m4Var4.d0 = null;
                            }
                            m4Var4.S = 0;
                            m4Var4.T = 0.0f;
                            m4Var4.o(true);
                            m4Var4.requestLayout();
                            m4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
