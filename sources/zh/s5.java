package zh;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wz;
import org.telegram.ui.w01;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class s5 implements q7 {
    public final vl0 a;
    public final w01 b;
    public final int[] c;
    public final boolean d;
    public r5 e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public int s;

    public s5(vl0 vl0Var, boolean z10) {
        this.c = new int[2];
        this.a = vl0Var;
        this.d = z10;
        this.b = null;
    }

    public static s5 a(vl0 vl0Var) {
        return new s5(vl0Var, false);
    }

    @Override // zh.q7
    public final void H0(long j3, int i10, j2 j2Var) {
        ArrayList arrayList;
        vl0 vl0Var = this.a;
        if (vl0Var != null && (vl0Var.getParent() instanceof l)) {
            l lVar = (l) vl0Var.getParent();
            if (lVar.k(j3)) {
                lVar.b0.add(j2Var);
                return;
            } else {
                j2Var.run();
                return;
            }
        }
        int i11 = 0;
        if (vl0Var == null || !(vl0Var.getParent() instanceof z3)) {
            if (this.d) {
                i5 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
                ArrayList arrayList2 = storiesController.h;
                storiesController.v(arrayList2);
                Collections.sort(arrayList2, storiesController.J);
                NotificationCenter.getInstance(storiesController.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            }
            j2Var.run();
            return;
        }
        z3 z3Var = (z3) vl0Var.getParent();
        wz wzVar = z3Var.x;
        v3 v3Var = z3Var.w;
        if (v3Var != null && (arrayList = v3Var.c) != null && wzVar != null) {
            while (true) {
                if (i11 >= arrayList.size()) {
                    i11 = -1;
                    break;
                }
                r3 r3Var = (r3) arrayList.get(i11);
                if (r3Var != null) {
                    TL_stories.StoryReaction storyReaction = r3Var.c;
                    if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                        if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.id == i10) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11++;
            }
            if (i11 >= 0) {
                int L0 = wzVar.L0();
                int N0 = wzVar.N0();
                if (i11 < L0 || i11 > N0) {
                    wzVar.h1(i11, AndroidUtilities.dp(60.0f));
                    vl0Var.post(j2Var);
                    return;
                }
            }
        }
        j2Var.run();
    }

    @Override // zh.q7
    public final void b(boolean z10) {
        r5 r5Var = this.e;
        if (r5Var != null) {
            r5Var.b(z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(r7 r7Var) {
        View view = r7Var.g;
        if (view == 0) {
            return;
        }
        if (view instanceof q5) {
            ((q5) view).a(this.c);
            r7Var.h = r1[0];
            r7Var.i = r1[1] - this.s;
            return;
        }
        if (view instanceof ha) {
            r7Var.h = ((ha) view).X2;
            r7Var.i = (view.getMeasuredHeight() - r7Var.g.getPaddingBottom()) - this.s;
        } else {
            r7Var.h = view.getPaddingTop();
            r7Var.i = (r7Var.g.getMeasuredHeight() - r7Var.g.getPaddingBottom()) - this.s;
        }
    }

    @Override // zh.q7
    public final boolean y0(long j3, int i10, int i11, int i12, r7 r7Var) {
        o7 o7Var = null;
        r7Var.a = null;
        r7Var.b = null;
        r7Var.c = null;
        r7Var.e = null;
        vl0 vl0Var = this.a;
        l lVar = (vl0Var == null || !(vl0Var.getParent() instanceof l)) ? null : (l) vl0Var.getParent();
        ViewGroup viewGroup = (lVar == null || lVar.g()) ? vl0Var : lVar.r;
        ViewGroup viewGroup2 = this.b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof k) {
                    k kVar = (k) childAt;
                    if (kVar.E == j3) {
                        r7Var.a = childAt;
                        r7Var.b = kVar.r;
                        r7Var.m = kVar.O;
                        r7Var.d = kVar.R;
                        l lVar2 = (l) kVar.getParent().getParent();
                        r7Var.g = lVar2;
                        r7Var.i = 0.0f;
                        r7Var.h = 0.0f;
                        r7Var.k = 1.0f;
                        if (kVar.G && lVar2.g()) {
                            r7Var.f = new th.e(new Path(), 24);
                            return true;
                        }
                        r7Var.f = o7Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                    org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) childAt;
                    ImageReceiver imageReceiver = r2Var.Y1;
                    org.telegram.ui.Cells.j2 j2Var = r2Var.u0;
                    long dialogId = r2Var.getDialogId();
                    boolean z10 = this.d;
                    if ((dialogId == j3 && !z10) || (z10 && r2Var.O())) {
                        r7Var.a = childAt;
                        r7Var.m = j2Var;
                        r7Var.b = imageReceiver;
                        r7Var.g = (View) r2Var.getParent();
                        if (z10) {
                            r7Var.l = imageReceiver;
                            boolean z11 = j2Var.w;
                        }
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var.getMessageObject().getId() == i10) {
                        r7Var.a = childAt;
                        if (i12 == 1 || i12 == 2) {
                            r7Var.c = t1Var.getPhotoImage();
                        } else {
                            r7Var.c = t1Var.F9;
                        }
                        r7Var.g = (View) t1Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        r7Var.a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            r7Var.b = w0Var.getPhotoImage();
                        } else {
                            r7Var.c = w0Var.getPhotoImage();
                        }
                        r7Var.g = (View) w0Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.u7) && vl0Var != null) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    MessageObject messageObject = u7Var.getMessageObject();
                    if ((u7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        cl0 fastScroll = vl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        r7Var.a = childAt;
                        r7Var.c = u7Var.c;
                        r7Var.e = new f21(u7Var, fastScroll, iArr, 11);
                        r7Var.g = (View) u7Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof bb) {
                    bb bbVar = (bb) childAt;
                    if (bbVar.getDialogId() == j3) {
                        gg.i1 i1Var = bbVar.a;
                        r7Var.a = i1Var;
                        r7Var.m = bbVar.T;
                        r7Var.b = i1Var.getImageReceiver();
                        r7Var.g = (View) bbVar.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p6) {
                    org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                    w9 w9Var = p6Var.h;
                    if (p6Var.x != j3) {
                        continue;
                    } else {
                        boolean z12 = (w9Var == null || w9Var.getImageReceiver() == null || w9Var.getImageReceiver().getImageDrawable() == null) ? false : true;
                        if (p6Var.n == i11 && z12) {
                            r7Var.a = w9Var;
                            r7Var.c = w9Var.getImageReceiver();
                            r7Var.g = (View) p6Var.getParent();
                            float alphaInternal = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            r7Var.k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                r7Var.j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, p6Var.getResourcesProvider()));
                            }
                            c(r7Var);
                            return true;
                        }
                        if (!z12) {
                            org.telegram.ui.Cells.o6 o6Var = p6Var.c;
                            r7Var.a = o6Var;
                            r7Var.m = p6Var.y;
                            r7Var.b = o6Var.getImageReceiver();
                            r7Var.g = (View) p6Var.getParent();
                            float alphaInternal2 = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            r7Var.k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                r7Var.j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, p6Var.getResourcesProvider()));
                            }
                            c(r7Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                    if (j6Var.getDialogId() == j3) {
                        r7Var.a = j6Var;
                        r7Var.m = j6Var.u0;
                        r7Var.b = j6Var.r;
                        r7Var.g = (View) j6Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) childAt;
                    if (d8Var.getPostInfo().b() == i11) {
                        r7Var.a = d8Var.getImageView();
                        r7Var.m = d8Var.getStoryAvatarParams();
                        r7Var.c = d8Var.getImageView().getImageReceiver();
                        r7Var.g = (View) d8Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        r7Var.a = b5Var.getAvatarImageView();
                        r7Var.m = b5Var.getStoryAvatarParams();
                        r7Var.b = b5Var.getAvatarImageView().getImageReceiver();
                        r7Var.g = (View) b5Var.getParent();
                        r7Var.k = 1.0f;
                        c(r7Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                o7Var = null;
            }
        }
        return false;
    }

    public s5(w01 w01Var) {
        this.c = new int[2];
        this.b = w01Var;
        this.a = null;
    }
}
