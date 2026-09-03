package vh;

import android.animation.ValueAnimator;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ m4(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar;
        a aVar2;
        TL_iv.pageBlockSlideshow pageblockslideshow;
        switch (this.a) {
            case 0:
                final p4 p4Var = this.b;
                ArrayList arrayList = p4Var.B;
                int indexOf = arrayList.indexOf(view);
                if (p4Var.K != null && p4Var.a != null) {
                    List m9 = p4Var.m();
                    if (indexOf >= 0 && indexOf < m9.size() && indexOf < arrayList.size()) {
                        final t tVar = (t) m9.get(indexOf);
                        p70 C = p4Var.K.a.e3.C((View) arrayList.get(indexOf));
                        boolean z4 = tVar.n;
                        final int i10 = 0;
                        C.c(z4 ? R.drawable.msg_spoiler_off : R.drawable.msg_spoiler, LocaleController.getString(z4 ? R.string.DisablePhotoSpoiler : R.string.EnablePhotoSpoiler), new Runnable() { // from class: vh.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i10) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        l3 l3Var = p4Var2.K;
                                        if (l3Var != null && (aVar3 = p4Var2.a) != null) {
                                            s3 s3Var = l3Var.a;
                                            s3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = s3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock M3 = s3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.n;
                                                }
                                                s3Var.m4(aVar3);
                                                d2 d2Var2 = s3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                s3Var.e3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        l3 l3Var2 = p4Var3.K;
                                        if (l3Var2 != null && (aVar4 = p4Var3.a) != null) {
                                            s3.M1(aVar4, tVar, l3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, false);
                        final int i11 = 1;
                        C.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: vh.n4
                            @Override // java.lang.Runnable
                            public final void run() {
                                a aVar3;
                                a aVar4;
                                switch (i11) {
                                    case 0:
                                        p4 p4Var2 = p4Var;
                                        l3 l3Var = p4Var2.K;
                                        if (l3Var != null && (aVar3 = p4Var2.a) != null) {
                                            s3 s3Var = l3Var.a;
                                            s3Var.getClass();
                                            t tVar2 = tVar;
                                            if (tVar2 != null) {
                                                d2 d2Var = s3Var.G3;
                                                if (d2Var != null) {
                                                    d2Var.d();
                                                }
                                                tVar2.n = !tVar2.n;
                                                TL_iv.PageBlock M3 = s3.M3(aVar3, tVar2);
                                                if (M3 instanceof TL_iv.pageBlockPhoto) {
                                                    ((TL_iv.pageBlockPhoto) M3).spoiler = tVar2.n;
                                                } else if (M3 instanceof TL_iv.pageBlockVideo) {
                                                    ((TL_iv.pageBlockVideo) M3).spoiler = tVar2.n;
                                                }
                                                s3Var.m4(aVar3);
                                                d2 d2Var2 = s3Var.G3;
                                                if (d2Var2 != null) {
                                                    d2Var2.h();
                                                }
                                                s3Var.e3.onContentChanged();
                                                break;
                                            }
                                        }
                                        break;
                                    default:
                                        p4 p4Var3 = p4Var;
                                        l3 l3Var2 = p4Var3.K;
                                        if (l3Var2 != null && (aVar4 = p4Var3.a) != null) {
                                            s3.M1(aVar4, tVar, l3Var2.a);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }, true);
                        C.a0(0.0f, -AndroidUtilities.dp(38.0f));
                        if (p4Var.E) {
                            C.u = false;
                            C.v = true;
                            C.s = 0;
                        }
                        C.Z();
                        break;
                    }
                }
                break;
            case 1:
                p4 p4Var2 = this.b;
                l3 l3Var = p4Var2.K;
                if (l3Var != null && (aVar = p4Var2.a) != null) {
                    s3 s3Var = l3Var.a;
                    s3Var.Y3 = aVar;
                    s3Var.e3.n(0);
                    break;
                }
                break;
            default:
                p4 p4Var3 = this.b;
                l3 l3Var2 = p4Var3.K;
                if (l3Var2 != null && (aVar2 = p4Var3.a) != null) {
                    s3 s3Var2 = l3Var2.a;
                    s3Var2.getClass();
                    if (s3.A3(aVar2.b)) {
                        d2 d2Var = s3Var2.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        ArrayList<TL_iv.PageBlock> f32 = s3.f3(aVar2.b);
                        TL_iv.PageBlock pageBlock = aVar2.b;
                        TL_iv.PageCaption pageCaption = pageBlock.caption;
                        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                            TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockcollage.items = f32;
                            pageblockcollage.caption = pageCaption;
                            pageblockslideshow = pageblockcollage;
                        } else {
                            TL_iv.pageBlockSlideshow pageblockslideshow2 = new TL_iv.pageBlockSlideshow();
                            if (f32 == null) {
                                f32 = new ArrayList<>();
                            }
                            pageblockslideshow2.items = f32;
                            pageblockslideshow2.caption = pageCaption;
                            pageblockslideshow = pageblockslideshow2;
                        }
                        aVar2.b = pageblockslideshow;
                        d2 d2Var2 = s3Var2.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        View y12 = s3Var2.y1(aVar2);
                        if (y12 instanceof p4) {
                            p4 p4Var4 = (p4) y12;
                            ValueAnimator valueAnimator = p4Var4.f0;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                p4Var4.f0 = null;
                            }
                            if (p4Var4.getParent() != null) {
                                p4Var4.getParent().requestDisallowInterceptTouchEvent(false);
                            }
                            VelocityTracker velocityTracker = p4Var4.e0;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                p4Var4.e0 = null;
                            }
                            p4Var4.T = 0;
                            p4Var4.U = 0.0f;
                            p4Var4.o(true);
                            p4Var4.requestLayout();
                            p4Var4.invalidate();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
