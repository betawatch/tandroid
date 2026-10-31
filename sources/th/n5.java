package th;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.nx0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n5 implements k7 {
    public final tk0 a;
    public final nx0 b;
    public final int[] c;
    public final boolean d;
    public m5 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public n5(tk0 tk0Var, boolean z10) {
        this.c = new int[2];
        this.a = tk0Var;
        this.d = z10;
        this.b = null;
    }

    public static n5 a(tk0 tk0Var) {
        return new n5(tk0Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(l7 l7Var) {
        View view = l7Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof l5) {
            ((l5) view).a(this.c);
            l7Var.h = r1[0];
            l7Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof r9) {
            l7Var.h = ((r9) view).e3;
            l7Var.i = (view.getMeasuredHeight() - l7Var.g.getPaddingBottom()) - this.s;
        } else {
            l7Var.h = view.getPaddingTop();
            l7Var.i = (l7Var.g.getMeasuredHeight() - l7Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // th.k7
    public final void c(boolean z10) {
        m5 m5Var = this.e;
        if (m5Var != null) {
            m5Var.c(z10);
        }
    }

    @Override // th.k7
    public final void d(long j10, int i10, i2 i2Var) {
        ArrayList arrayList;
        tk0 tk0Var = this.a;
        if (tk0Var != null && (tk0Var.getParent() instanceof m)) {
            m mVar = (m) tk0Var.getParent();
            if (mVar.k(j10)) {
                mVar.b0.add(i2Var);
                return;
            } else {
                i2Var.run();
                return;
            }
        }
        int i11 = 0;
        if (tk0Var == null || !(tk0Var.getParent() instanceof y3)) {
            if (this.d) {
                e5 O1 = vp.r1(d20.s0).O1();
                ArrayList arrayList2 = O1.h;
                O1.v(arrayList2);
                Collections.sort(arrayList2, O1.J);
                zs.f(O1.a).k(zs.v5, new Object[0]);
            }
            i2Var.run();
            return;
        }
        y3 y3Var = (y3) tk0Var.getParent();
        az azVar = y3Var.y;
        u3 u3Var = y3Var.x;
        if (u3Var != null && (arrayList = u3Var.c) != null && azVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                q3 q3Var = (q3) arrayList.get(i11);
                if (q3Var != null) {
                    TL_stories.StoryReaction storyReaction = q3Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && org.telegram.messenger.o5.o(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.id == i10) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11++;
            }
            if (i11 >= 0) {
                int L0 = azVar.L0();
                int N0 = azVar.N0();
                if (i11 < L0 || i11 > N0) {
                    azVar.h1(i11, org.telegram.messenger.i0.L(60.0f));
                    tk0Var.post(i2Var);
                    return;
                }
            }
        }
        i2Var.run();
    }

    @Override // th.k7
    public final boolean v(long j10, int i10, int i11, int i12, l7 l7Var) {
        i7 i7Var = null;
        l7Var.a = null;
        l7Var.b = null;
        l7Var.c = null;
        l7Var.e = null;
        tk0 tk0Var = this.a;
        m mVar = (tk0Var == null || !(tk0Var.getParent() instanceof m)) ? null : (m) tk0Var.getParent();
        ViewGroup viewGroup = (mVar == null || mVar.g()) ? tk0Var : mVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof l) {
                    l lVar = (l) childAt;
                    if (lVar.E == j10) {
                        l7Var.a = childAt;
                        l7Var.b = lVar.r;
                        l7Var.m = lVar.O;
                        l7Var.d = lVar.R;
                        m mVar2 = (m) lVar.getParent().getParent();
                        l7Var.g = mVar2;
                        l7Var.i = 0.0f;
                        l7Var.h = 0.0f;
                        l7Var.k = 1.0f;
                        if (lVar.G && mVar2.g()) {
                            l7Var.f = new rh.d0(new Path(), 15);
                            return true;
                        }
                        l7Var.f = i7Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v2) {
                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) childAt;
                    ImageReceiver imageReceiver = v2Var.Y1;
                    org.telegram.ui.Cells.m2 m2Var = v2Var.u0;
                    long dialogId = v2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j10 && !z10) || (z10 && v2Var.V())) {
                        l7Var.a = childAt;
                        l7Var.m = m2Var;
                        l7Var.b = imageReceiver;
                        l7Var.g = (View) v2Var.getParent();
                        if (z10) {
                            l7Var.l = imageReceiver;
                            boolean z11 = m2Var.w;
                        }
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var.getMessageObject().f1() == i10) {
                        l7Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            l7Var.c = q1Var.getPhotoImage();
                        } else {
                            l7Var.c = q1Var.R7;
                        }
                        l7Var.g = (View) q1Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    if (s0Var.getMessageObject().f1() == i10) {
                        l7Var.a = childAt;
                        if (s0Var.getMessageObject().k.media.storyItem.noforwards) {
                            l7Var.b = s0Var.getPhotoImage();
                        } else {
                            l7Var.c = s0Var.getPhotoImage();
                        }
                        l7Var.g = (View) s0Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.s7) && tk0Var != null) {
                    org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) childAt;
                    jj messageObject = s7Var.getMessageObject();
                    if ((s7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.x4() && messageObject.f1() == i11 && messageObject.l.dialogId == j10)) {
                        zj0 fastScroll = tk0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        l7Var.a = childAt;
                        l7Var.c = s7Var.c;
                        l7Var.e = new q5.a(s7Var, fastScroll, iArr, 6);
                        l7Var.g = (View) s7Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof pa) {
                    pa paVar = (pa) childAt;
                    if (paVar.getDialogId() == j10) {
                        ag.d2 d2Var = paVar.a;
                        l7Var.a = d2Var;
                        l7Var.m = paVar.T;
                        l7Var.b = d2Var.getImageReceiver();
                        l7Var.g = (View) paVar.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.q6) {
                    org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) childAt;
                    g9 g9Var = q6Var.h;
                    if (q6Var.D != j10) {
                        continue;
                    } else {
                        boolean z12 = (g9Var == null || g9Var.getImageReceiver() == null || g9Var.getImageReceiver().S == null) ? false : true;
                        if (q6Var.n == i11 && z12) {
                            l7Var.a = g9Var;
                            l7Var.c = g9Var.getImageReceiver();
                            l7Var.g = (View) q6Var.getParent();
                            float alphaInternal = q6Var.getAlphaInternal() * q6Var.getAlpha();
                            l7Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                l7Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, q6Var.getResourcesProvider()));
                            }
                            b(l7Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.p6 p6Var = q6Var.c;
                            l7Var.a = p6Var;
                            l7Var.m = q6Var.E;
                            l7Var.b = p6Var.getImageReceiver();
                            l7Var.g = (View) q6Var.getParent();
                            float alphaInternal2 = q6Var.getAlphaInternal() * q6Var.getAlpha();
                            l7Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                l7Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, q6Var.getResourcesProvider()));
                            }
                            b(l7Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.k6) {
                    org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                    if (k6Var.getDialogId() == j10) {
                        l7Var.a = k6Var;
                        l7Var.m = k6Var.u0;
                        l7Var.b = k6Var.r;
                        l7Var.g = (View) k6Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof a8) {
                    a8 a8Var = (a8) childAt;
                    if (a8Var.getPostInfo().b() == i11) {
                        l7Var.a = a8Var.getImageView();
                        l7Var.m = a8Var.getStoryAvatarParams();
                        l7Var.c = a8Var.getImageView().getImageReceiver();
                        l7Var.g = (View) a8Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.e5) {
                    org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) childAt;
                    if (e5Var.getStoryItem() != null && e5Var.getStoryItem().dialogId == j10 && e5Var.getStoryItem().messageId == i10) {
                        l7Var.a = e5Var.getAvatarImageView();
                        l7Var.m = e5Var.getStoryAvatarParams();
                        l7Var.b = e5Var.getAvatarImageView().getImageReceiver();
                        l7Var.g = (View) e5Var.getParent();
                        l7Var.k = 1.0f;
                        b(l7Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                i7Var = null;
            }
        }
        return false;
    }

    public n5(nx0 nx0Var) {
        this.c = new int[2];
        this.b = nx0Var;
        this.a = null;
    }
}
