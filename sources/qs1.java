// default package

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qs1 implements rk1 {
    public final /* synthetic */ vs1 a;

    public qs1(vs1 vs1Var) {
        this.a = vs1Var;
    }

    @Override // rk1
    public final void A(uk1 uk1Var, int i) {
        va7 va7Var = new va7((Object) this, (Object) uk1Var, i, (byte) 13);
        mu1 mu1Var = this.a.R;
        if (!mu1Var.D0.O) {
            va7Var.run();
        } else {
            mu1Var.xb(false, true, true);
            gl.e3(va7Var, 80L);
        }
    }

    @Override // rk1
    public final void C(long j) {
        mu1 mu1Var = this.a.R;
        int i = mu1.md;
        mu1Var.sa(j);
    }

    @Override // rk1
    public final void G(uk1 uk1Var) {
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject != null && messageObject.D == 22 && !uk1Var.getMessageObject().O3() && uk1Var.getMessageObject().X4() && uk1Var.getMessageObject().S2()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.getResourceProvider(), mu1Var.getParentActivity());
            String M0 = k96.M0(2131746091, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131746092, null);
            alertDialog$Builder.j(k96.M0(2131746128, null), new rh1((Object) this, (byte) 10));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            mu1Var.showDialog(hdVar);
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, mu1Var.getResourceProvider());
            }
        }
    }

    @Override // rk1
    public final void R(uk1 uk1Var) {
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject == null || mu1Var.g2 == null) {
            return;
        }
        if (hc2.p0(mu1Var.e)) {
            mu1Var.g2.k(k27.u1(messageObject.k), true);
        } else {
            mu1Var.g2.k(messageObject.Y1(), true);
        }
    }

    @Override // rk1
    public final void Z(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        int i;
        mu1 mu1Var = this.a.R;
        if (str != null) {
            b(uk1Var);
            c01 c01Var = mu1Var.ec;
            ji8 ji8Var = ji8.N2;
            pt4.Z0(LaunchActivity.Q(), str, c01Var);
            return;
        }
        i = ((d) mu1Var).currentAccount;
        xh8 xh8Var = new xh8(mu1Var, i, mu1Var.h(), new mu4(tL_premiumGiftOption), null, mu1Var.Ba);
        xh8Var.E2 = false;
        xh8Var.X1 = uk1Var.getMessageObject().N3();
        mu1Var.showDialog(xh8Var);
    }

    @Override // rk1
    public final long a() {
        return 0L;
    }

    @Override // rk1
    public final boolean a0(uk1 uk1Var, float f, float f2) {
        boolean z;
        mu1 mu1Var = this.a.R;
        z = ((d) mu1Var).inPreviewMode;
        if (z) {
            return false;
        }
        return mu1Var.Q5(uk1Var, false, false, f, f2, true, true, false);
    }

    public final void b(uk1 uk1Var) {
        mu1 mu1Var = this.a.R;
        c01 c01Var = mu1Var.ec;
        if (c01Var != null) {
            c01Var.a(true);
        }
        mu1Var.ec = uk1Var.getMessageObject() == null ? null : new pt1(this, uk1Var, (byte) 6);
    }

    @Override // rk1
    public final long d() {
        return this.a.R.d();
    }

    @Override // rk1
    public final boolean l() {
        return false;
    }

    @Override // rk1
    public final void m(uk1 uk1Var) {
        mq1 mq1Var;
        mu1 mu1Var = this.a.R;
        k27 messageObject = uk1Var.getMessageObject();
        if (messageObject == null) {
            return;
        }
        messageObject.M1 = true;
        jq1 jq1Var = mu1Var.A0;
        if (jq1Var != null && (mq1Var = mu1Var.C0) != null && mq1Var.y < 0) {
            int childCount = jq1Var.getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    break;
                }
                View childAt = mu1Var.A0.getChildAt(childCount);
                mu1Var.A0.getClass();
                if (RecyclerView.R(childAt) >= 0) {
                    if (childAt instanceof gb2) {
                        if (((gb2) childAt).getCurrentMessagesGroup() == null) {
                            mu1Var.Y6(childAt);
                            break;
                        }
                    } else if (childAt instanceof uk1) {
                        mu1Var.Y6(childAt);
                        break;
                    }
                }
                childCount--;
            }
        }
        mu1Var.Lc(messageObject, false);
    }

    @Override // rk1
    public final void n(uk1 uk1Var, String str) {
        b(uk1Var);
        mu1 mu1Var = this.a.R;
        pt4.Z0(mu1Var, str, mu1Var.ec);
    }

    @Override // rk1
    public final void o(uk1 uk1Var, int i, int i2) {
        mp1 mp1Var = new mp1(this, uk1Var, i, i2, (byte) 1);
        mu1 mu1Var = this.a.R;
        if (!mu1Var.D0.O) {
            mp1Var.run();
        } else {
            mu1Var.xb(false, true, true);
            gl.e3(mp1Var, 80L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rk1
    public final void r(uk1 uk1Var) {
        TLRPC.VideoSize videoSize;
        TLRPC.VideoSize videoSize2;
        File I;
        int i;
        TLRPC.WallPaper wallPaper;
        String str;
        k27 messageObject = uk1Var.getMessageObject();
        PhotoViewer r0 = PhotoViewer.r0();
        mu1 mu1Var = this.a.R;
        r0.S1(null, mu1Var, mu1Var.Ba);
        TLRPC.PhotoSize w = ba4.w(messageObject.p0, 640, false, null, false);
        if (uk1Var.getMessageObject().D == 24) {
            m8b orCreateStoryViewer = mu1Var.getOrCreateStoryViewer();
            jq1 jq1Var = mu1Var.A0;
            orCreateStoryViewer.getClass();
            k27 messageObject2 = uk1Var.getMessageObject();
            if (mu1Var.getParentActivity() == null || messageObject2.D != 24) {
                return;
            }
            TLRPC.MessageMedia messageMedia = messageObject2.k.media;
            TL_stories.StoryItem storyItem = messageMedia.storyItem;
            storyItem.dialogId = cf3.n(messageMedia.peer);
            storyItem.messageId = messageObject2.e1();
            orCreateStoryViewer.J(mu1Var.getParentActivity(), messageObject2.k.media.storyItem, p2b.a(jq1Var));
            return;
        }
        if (uk1Var.getMessageObject().D != 22) {
            ArrayList<TLRPC.VideoSize> arrayList = messageObject.k.action.photo.video_sizes;
            if (arrayList == null || arrayList.isEmpty()) {
                videoSize = null;
                videoSize2 = null;
            } else {
                videoSize = ba4.x(1000, messageObject.k.action.photo.video_sizes);
                ArrayList<TLRPC.VideoSize> arrayList2 = messageObject.k.action.photo.video_sizes;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if ((arrayList2.get(i2) instanceof TLRPC.TL_videoSizeEmojiMarkup) || (arrayList2.get(i2) instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                        videoSize2 = arrayList2.get(i2);
                        break;
                    }
                }
                videoSize2 = null;
            }
            if (uk1Var.getMessageObject().D != 21 || messageObject.O3()) {
                if (videoSize != null) {
                    PhotoViewer.r0().k1(videoSize.location, gl5.j(videoSize, messageObject.k.action.photo), mu1Var.db);
                    if (uk1Var.getMessageObject().D == 21) {
                        PhotoViewer.r0().W1(k96.M0(2131744131, null));
                        return;
                    }
                    return;
                }
                if (w == null) {
                    PhotoViewer.r0().l1(messageObject, null, 0L, 0L, 0L, mu1Var.db);
                    return;
                }
                PhotoViewer.r0().k1(w.location, gl5.i(w, messageObject.k.action.photo), mu1Var.db);
                if (uk1Var.getMessageObject().D == 21) {
                    PhotoViewer.r0().W1(k96.M0(2131744134, null));
                    return;
                }
                return;
            }
            if (messageObject.q) {
                return;
            }
            if (videoSize2 != null) {
                wl5 wl5Var = new wl5(0, true, true);
                wl5Var.a = mu1Var;
                wl5Var.d();
                wl5Var.c.d2.u0(null, videoSize2, 0L);
                wl5Var.b = new qm1((Object) mu1Var, (Object) new TLRPC.FileLocation[1], (Object) new TLRPC.FileLocation[1], mu1Var.getUserConfig().e(), (byte) 5);
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            gl5.j(videoSize, messageObject.k.action.photo);
            ba4 fileLoader = mu1Var.getFileLoader();
            if (videoSize == null) {
                TLRPC.Photo photo = messageObject.k.action.photo;
                fileLoader.getClass();
                I = ba4.I(photo);
            } else {
                fileLoader.getClass();
                I = ba4.I(videoSize);
            }
            File file = new File(ba4.z(4), I.getName());
            if (!I.exists()) {
                if (!file.exists()) {
                    return;
                } else {
                    I = file;
                }
            }
            jm6 jm6Var = new jm6(0, I.getAbsolutePath(), 0, false, 0, 0);
            jm6Var.a = mu1Var.a0.getFieldText();
            jm6Var.b = videoSize != null;
            arrayList3.add(jm6Var);
            PhotoViewer.r0().n1(arrayList3, 0, 1, false, new ps1(this, messageObject, jm6Var), null);
            if (jm6Var.b) {
                PhotoViewer.r0().W1(k96.M0(2131744131, null));
            } else {
                PhotoViewer.r0().W1(k96.M0(2131744134, null));
            }
            ul5 ul5Var = new ul5(1, mu1Var.getUserConfig().f());
            ul5Var.e = videoSize != null;
            ul5Var.b = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.l6));
            PhotoViewer.r0().F1(ul5Var);
            return;
        }
        i = ((d) mu1Var).currentAccount;
        na7 q1 = na7.q1(i);
        RadialProgress2 radialProgress2 = uk1Var.K1;
        if (radialProgress2 != null && radialProgress2.i.q == 3 && messageObject.e1() < 0 && (str = q1.J2) != null && TextUtils.equals(messageObject.k.action.wallpaper.uploadingImage, str)) {
            vjb vjbVar = q1.K2;
            if (vjbVar != null) {
                if (vjbVar.s != null) {
                    for (int i3 = 0; i3 < q1.K2.s.size(); i3++) {
                        ConnectionsManager.getInstance(q1.currentAccount).cancelRequest(((Integer) q1.K2.s.get(i3)).intValue(), true);
                    }
                }
                ba4.G(q1.currentAccount).b(q1.J2, false);
                long j = q1.K2.n;
                if (j != 0) {
                    if (j >= 0) {
                        TLRPC.UserFull W1 = q1.W1(j);
                        if (W1 != null) {
                            W1.wallpaper = q1.K2.t;
                            kk7.f(q1.currentAccount).k(67, Long.valueOf(q1.K2.n), W1);
                        }
                    } else {
                        TLRPC.ChatFull L0 = q1.L0(-j);
                        if (L0 != null) {
                            L0.wallpaper = q1.K2.t;
                            kk7 f = kk7.f(q1.currentAccount);
                            Boolean bool = Boolean.FALSE;
                            f.k(30, L0, 0, bool, bool);
                        }
                    }
                }
                q1.K2 = null;
                q1.J2 = null;
            }
            mu1Var.Oa(messageObject);
            return;
        }
        k27 k27Var = uk1Var.Q0;
        if (k27Var == null || !uk1Var.X(k27Var) || uk1Var.y1 == null) {
            mu1Var.Lb();
            return;
        }
        TLRPC.MessageAction messageAction = messageObject.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
            TLRPC.WallPaper wallPaper2 = ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).wallpaper;
            if (wallPaper2.pattern || wallPaper2.document == null) {
                String str2 = wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper2.settings;
                krc krcVar = new krc(str2, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, gl.q1(wallPaperSettings.rotation, false), r1.intensity / 100.0f, wallPaper2.settings.motion);
                wallPaper = krcVar;
                if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                    krcVar.g = (TLRPC.TL_wallPaper) wallPaper2;
                    wallPaper = krcVar;
                }
            } else {
                wallPaper = wallPaper2;
            }
            boolean o = bkb.I.o();
            amb ambVar = new amb(wallPaper, mu1Var, o);
            TLRPC.WallPaperSettings wallPaperSettings2 = wallPaper2.settings;
            if (wallPaperSettings2 != null) {
                boolean z = wallPaperSettings2.blur;
                boolean z2 = wallPaperSettings2.motion;
                ambVar.H1 = z;
                ambVar.G1 = z2;
                ambVar.p1 = wallPaperSettings2.intensity / 100.0f;
            }
            ambVar.s0 = messageObject;
            ambVar.g1(k27.B0(messageObject.k));
            ambVar.a.a = mu1Var.Ba;
            ambVar.r1 = new bmb(mu1Var, o);
            mu1Var.presentFragment(ambVar);
        }
    }

    @Override // rk1
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
        kr1 kr1Var = this.a.R.Ua;
        FrameLayout frameLayout = kr1Var.H;
        HashMap hashMap = kr1Var.f;
        Random random = kr1Var.h;
        ArrayList arrayList = kr1Var.G;
        if (arrayList.size() > 12 || !uk1Var.getPhotoImage().E()) {
            return;
        }
        float f = uk1Var.getPhotoImage().O0;
        float f2 = uk1Var.getPhotoImage().N0;
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((yu3) arrayList.get(i3)).p == uk1Var.getMessageObject().e1()) {
                i++;
                if (((yu3) arrayList.get(i3)).r.y() == null || ((yu3) arrayList.get(i3)).r.y().t()) {
                    return;
                }
            }
            if (((yu3) arrayList.get(i3)).q != null && document != null && ((yu3) arrayList.get(i3)).q.id == document.id) {
                i2++;
            }
        }
        if (i < 4) {
            yu3 yu3Var = new yu3();
            yu3Var.h = true;
            if (!yu3Var.i) {
                yu3Var.f = ((random.nextInt() % 101) / 100.0f) * (f2 / 4.0f);
                yu3Var.g = ((random.nextInt() % 101) / 100.0f) * (f / 4.0f);
            }
            yu3Var.p = uk1Var.getMessageObject().e1();
            yu3Var.m = true;
            ImageReceiver imageReceiver = yu3Var.r;
            imageReceiver.u0 = true;
            int f3 = zu3.f();
            if (i2 > 0) {
                Integer num = (Integer) hashMap.get(Long.valueOf(document.id));
                int intValue = num == null ? 0 : num.intValue();
                hashMap.put(Long.valueOf(document.id), Integer.valueOf((intValue + 1) % 4));
                StringBuilder sb = new StringBuilder();
                sb.append(intValue);
                sb.append("_");
                imageReceiver.w1 = de9.l(sb, yu3Var.p, "_");
            }
            yu3Var.q = document;
            yu3Var.r.d0(gl5.d(videoSize, document), tb4.m(f3, f3, "_"), null, "tgs", kr1Var.c, 1);
            imageReceiver.m0(ConnectionsManager.DEFAULT_DATACENTER_ID);
            imageReceiver.M(0);
            if (imageReceiver.y() != null) {
                if (yu3Var.h) {
                    imageReceiver.y().I(0, false, true);
                }
                imageReceiver.y().start();
            }
            arrayList.add(yu3Var);
            if (kr1Var.n) {
                imageReceiver.I();
                imageReceiver.p0(frameLayout);
            }
            frameLayout.invalidate();
        }
    }

    @Override // rk1
    public final d v() {
        return this.a.R;
    }

    @Override // rk1
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.R.f6(uk1Var, reactionCount, z, f, f2);
    }

    @Override // rk1
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }
}
