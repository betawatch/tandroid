package yg;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import bi.be;
import bi.ce;
import bi.kd;
import bi.od;
import bi.r9;
import bi.sb;
import bi.tb;
import bi.ud;
import bi.x4;
import bi.xd;
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.messenger.em;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z1;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.ProfileActivity;
import qg.a1;
import w7.a6;
import zh.a3;
import zh.a5;
import zh.b5;
import zh.e5;
import zh.h5;
import zh.i5;
import zh.j1;
import zh.l3;
import zh.l7;
import zh.o1;
import zh.t0;
import zh.t6;
import zh.t7;
import zh.u4;
import zh.u7;
import zh.v2;
import zh.v5;
import zh.w4;
import zh.w5;
import zh.x5;
import zh.z3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x018f A[Catch: all -> 0x011b, TryCatch #2 {all -> 0x011b, blocks: (B:45:0x00d1, B:48:0x00e1, B:50:0x0101, B:52:0x010c, B:54:0x0120, B:56:0x0126, B:59:0x0177, B:61:0x018f, B:62:0x0194, B:67:0x014a, B:69:0x014e), top: B:44:0x00d1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t0 t0Var;
        int i10;
        be beVar;
        t7 t7Var;
        int i11;
        boolean z10;
        int i12 = 12;
        int i13 = 2;
        String str = null;
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                y5 y5Var = (y5) this.c;
                s sVar = rVar.e2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.n.getText());
                for (y5 y5Var2 : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = sVar.n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        sVar.n.getText().delete(spanStart, spanEnd);
                        int i14 = spanEnd - spanStart;
                        p pVar = sVar.n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i14;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        break;
                    }
                }
                break;
            case 1:
                c0 c0Var = (c0) this.b;
                pk0 pk0Var = (pk0) this.c;
                c0Var.l = true;
                c0Var.a.invalidate();
                pk0Var.b1 = false;
                pk0Var.invalidate();
                c0Var.c(true);
                break;
            case 2:
                e0 e0Var = (e0) this.b;
                c cVar = (c) this.c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(cVar), e0Var.getText().getSpanEnd(cVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                break;
            case 3:
                q0 q0Var = (q0) this.b;
                n0 n0Var = (n0) this.c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.a;
                xv0 xv0Var = q0Var.z;
                if (e2.u(xv0Var)) {
                    ((o4) xv0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                break;
            case 4:
                ((u7) this.b).H(ProfileActivity.m4(((zh.k0) this.c).c));
                break;
            case 5:
                o1 o1Var = (o1) this.b;
                AndroidUtilities.addToClipboard(((zh.f0) this.c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(o1Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    break;
                }
                break;
            case 6:
                o1 o1Var2 = (o1) this.b;
                zh.k0 k0Var = (zh.k0) this.c;
                long j3 = k0Var.c;
                a3 a3Var = o1Var2.i0;
                if (j3 != UserConfig.getInstance(a3Var.C2).getClientUserId() && ((t0Var = o1Var2.h0.A0) == null || j3 != DialogObject.getPeerDialogId(t0Var.i()))) {
                    if (a3Var.O3 != null) {
                        for (int i15 = 0; i15 < a3Var.O3.peers.size(); i15++) {
                            if (j3 != DialogObject.getPeerDialogId(a3Var.O3.peers.get(i15).peer)) {
                            }
                        }
                    }
                    Context context = o1Var2.getContext();
                    long j10 = k0Var.c;
                    od odVar = new od(i13, o1Var2, k0Var);
                    zh.a0 a0Var = new zh.a0();
                    h3 h3Var = new h3(1, context, (f6) a0Var, false);
                    h3Var.fixNavigationBar();
                    LinearLayout f7 = em.f(context, 1);
                    TextView g10 = a2.g(context, 1, 20.0f);
                    g10.setTextColor(a0Var.F0(j6.j5));
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    f7.addView(g10, a6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    m4 m4Var = new m4(context, a0Var);
                    m4Var.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    f7.addView(m4Var, a6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final z1 z1Var = new z1(4, 21, context, a0Var, true);
                    tp checkBoxRound = z1Var.getCheckBoxRound();
                    int i16 = j6.V6;
                    int i17 = j6.g7;
                    int i18 = j6.k7;
                    checkBoxRound.b(i16, i17, i18);
                    z1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    z1Var.setOnClickListener(new View.OnClickListener() { // from class: zh.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    z1Var.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    int i19 = j6.i6;
                    z1Var.setBackground(j6.f0(a0Var.F0(i19), 2, -1));
                    f7.addView(z1Var, a6.n(-1, -2));
                    final z1 z1Var2 = new z1(4, 21, context, a0Var, true);
                    z1Var2.getCheckBoxRound().b(i16, i17, i18);
                    final int i20 = 1;
                    z1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j10)), null, false, true, false);
                    z1Var2.setOnClickListener(new View.OnClickListener() { // from class: zh.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i20) {
                                case 0:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var2.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    z1Var2.setBackground(j6.f0(a0Var.F0(i19), 2, -1));
                    f7.addView(z1Var2, a6.n(-1, -2));
                    final z1 z1Var3 = new z1(4, 21, context, a0Var, true);
                    z1Var3.getCheckBoxRound().b(i16, i17, i18);
                    z1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j10)), null, false, false, false);
                    final int i21 = 2;
                    z1Var3.setOnClickListener(new View.OnClickListener() { // from class: zh.v
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i21) {
                                case 0:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                                case 1:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                                default:
                                    z1Var3.c(!r3.b(), true);
                                    break;
                            }
                        }
                    });
                    z1Var3.setBackground(j6.f0(a0Var.F0(i19), 2, -1));
                    f7.addView(z1Var3, a6.n(-1, -2));
                    f9 f9Var = new f9(context, a0Var);
                    f9Var.setBackgroundColor(-16777216);
                    f9Var.setFixedSize(12);
                    f7.addView(f9Var, a6.n(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context);
                    bi.d dVar = new bi.d(context, a0Var, true);
                    dVar.g(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new hi.c(z1Var, z1Var2, z1Var3, odVar, h3Var, 12));
                    frameLayout.addView(dVar, a6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f7.addView(frameLayout, a6.n(-1, -2));
                    h3Var.setCustomView(f7);
                    h3Var.show();
                    break;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = o1Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(k0Var.a));
                ConnectionsManager.getInstance(o1Var2.N).sendRequest(deletegroupcallmessages, null);
                o1Var2.c(k0Var.a);
                break;
            case 7:
                t0 t0Var2 = (t0) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                t0Var2.getClass();
                int size = arrayList.size();
                int i22 = 0;
                while (i22 < size) {
                    Object obj = arrayList.get(i22);
                    i22++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(t0Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                break;
            case 8:
                ((t0) this.b).F.remove((String) this.c);
                break;
            case 9:
                a3 a3Var2 = (a3) this.b;
                x4 x4Var = (x4) this.c;
                a3Var2.removeView(x4Var);
                if (a3Var2.d2 == x4Var) {
                    a3Var2.d2 = null;
                    break;
                }
                break;
            case 10:
                a3 a3Var3 = (a3) this.b;
                ce E = ce.E((Activity) this.c, a3Var3.C2);
                k2.v vVar = a3Var3.M2;
                long j11 = (vVar == null || (t7Var = (t7) vVar.c) == null) ? 0L : t7Var.currentPosition;
                File h = a3Var3.O1.h();
                TL_stories.StoryItem storyItem = a3Var3.O1.a;
                r9 r9Var = new r9();
                r9Var.n = true;
                r9Var.t = storyItem.media;
                int i23 = r9Var.a;
                r9Var.q = MessagesController.getInstance(i23).getPeer(storyItem.dialogId);
                r9Var.r = storyItem.id;
                r9Var.s = storyItem.caption;
                r9Var.L = h;
                r9Var.M = false;
                r9Var.k0 = 720;
                r9Var.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    r9Var.K = false;
                    if (h != null) {
                        r9Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    r9Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i24 = 0;
                        while (true) {
                            if (i24 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i24);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    r9Var.k0 = documentAttribute.w;
                                    r9Var.l0 = documentAttribute.h;
                                    r9Var.i = documentAttribute.duration;
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            r9Var.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i25 = 0; i25 < storyItem.media.document.thumbs.size(); i25++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i25);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    r9Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        r9Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                r9Var.A();
                r9Var.e(storyItem);
                ud d = xd.d(a3Var3.J0);
                RectF rectF = E.H;
                WindowManager.LayoutParams layoutParams = E.h;
                WindowManager windowManager = E.f;
                int i26 = E.c;
                if (!E.d) {
                    if (!MessagesController.getInstance(i26).isFrozen()) {
                        E.u0 = false;
                        E.e = false;
                        E.B2 = false;
                        if (windowManager != null && (beVar = E.n) != null && beVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, E.n, layoutParams);
                            windowManager.addView(E.n, layoutParams);
                            E.g0();
                        }
                        E.K1 = r9Var;
                        sb.a(i26, r9Var);
                        r9 r9Var2 = E.K1;
                        E.O1 = (r9Var2 == null || !r9Var2.K) ? 0 : 1;
                        E.s0.g = false;
                        if (d != null) {
                            E.F = d;
                            E.J = d.a;
                            rectF.set(d.c);
                            E.G = d.b;
                            E.F.e();
                        } else {
                            E.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            E.G = AndroidUtilities.dp(8.0f);
                        }
                        E.r.c();
                        kd kdVar = E.h0;
                        int i27 = E.J;
                        kdVar.setBackgroundColor((i27 == 1 || i27 == 0) ? 0 : -14737633);
                        E.r.setTranslationX(0.0f);
                        E.r.setTranslationY(0.0f);
                        E.r.b(0.0f);
                        E.r.setScaleX(1.0f);
                        E.r.setScaleY(1.0f);
                        E.K = 0.0f;
                        AndroidUtilities.lockOrientation(E.b, 1);
                        r9 r9Var3 = E.K1;
                        if (r9Var3 != null) {
                            E.c1.setText(r9Var3.C0);
                        }
                        E.L(new tb(E, 7), j11);
                        i10 = 1;
                        E.b1.b(true, false);
                        E.K(1, false);
                        E.l0(-1, false, false);
                        E.e();
                        E.v0 = 0L;
                        E.w0 = "";
                        E.Q = new j1(a3Var3, i12);
                        E.R = new su0(i10, a3Var3, E);
                        break;
                    } else {
                        org.telegram.ui.b.b(i26);
                    }
                }
                i10 = 1;
                E.Q = new j1(a3Var3, i12);
                E.R = new su0(i10, a3Var3, E);
                break;
            case 11:
                v2 v2Var = (v2) this.b;
                u7 u7Var = (u7) this.c;
                v2Var.getClass();
                ((l7) v2Var.l.Q1).h(new a1(u7Var.f, 14, false));
                break;
            case 12:
                l3 l3Var = (l3) this.b;
                String str3 = (String) this.c;
                l3Var.h = null;
                z3 z3Var = l3Var.n;
                z3Var.Q = false;
                z3Var.O.c = str3.toLowerCase();
                z3.b(z3Var);
                break;
            case 13:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (callback != null) {
                    callback.run(Boolean.valueOf(tL_error == null));
                    break;
                }
                break;
            case 14:
                u4 u4Var = (u4) this.b;
                TLObject tLObject = (TLObject) this.c;
                zh.x4 x4Var2 = u4Var.q;
                int i28 = u4Var.c;
                ArrayList arrayList2 = u4Var.i;
                u4Var.I = 0;
                if (tLObject instanceof TL_stories.TL_foundStories) {
                    TL_stories.TL_foundStories tL_foundStories = (TL_stories.TL_foundStories) tLObject;
                    MessagesController.getInstance(i28).putUsers(tL_foundStories.users, false);
                    MessagesController.getInstance(i28).putChats(tL_foundStories.chats, false);
                    ArrayList<TL_stories.TL_foundStory> arrayList3 = tL_foundStories.stories;
                    int size2 = arrayList3.size();
                    int i29 = 0;
                    while (i29 < size2) {
                        TL_stories.TL_foundStory tL_foundStory = arrayList3.get(i29);
                        i29++;
                        TL_stories.TL_foundStory tL_foundStory2 = tL_foundStory;
                        tL_foundStory2.storyItem.dialogId = DialogObject.getPeerDialogId(tL_foundStory2.peer);
                        tL_foundStory2.storyItem.messageId = arrayList2.size();
                        MessageObject messageObject = new MessageObject(i28, tL_foundStory2.storyItem);
                        messageObject.generateThumbs(false);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(Integer.valueOf(arrayList2.size()));
                        u4Var.F.add(arrayList4);
                        arrayList2.add(messageObject);
                    }
                    u4Var.J = Math.max(arrayList2.size(), tL_foundStories.count);
                    if (tL_foundStories.stories.isEmpty()) {
                        u4Var.J = arrayList2.size();
                    }
                    if (arrayList2.size() < tL_foundStories.count && !tL_foundStories.stories.isEmpty()) {
                        str = tL_foundStories.next_offset;
                    }
                    u4Var.H = str;
                    u4Var.G = false;
                    AndroidUtilities.cancelRunOnUIThread(x4Var2);
                    AndroidUtilities.runOnUIThread(x4Var2);
                    break;
                }
                break;
            case 15:
                w4 w4Var = (w4) this.b;
                List list = (List) this.c;
                ArrayList arrayList5 = w4Var.h;
                arrayList5.clear();
                arrayList5.addAll(list);
                w4Var.d = true;
                w4Var.e = false;
                w4Var.d();
                NotificationCenter.getInstance(w4Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(w4Var.b), w4Var);
                break;
            case 16:
                w4 w4Var2 = (w4) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList6 = w4Var2.g;
                ArrayList arrayList7 = w4Var2.h;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    TL_stories.TL_albums tL_albums = (TL_stories.TL_albums) tLObject2;
                    ArrayList arrayList8 = new ArrayList(tL_albums.albums.size());
                    ArrayList<TL_stories.TL_storyAlbum> arrayList9 = tL_albums.albums;
                    int size3 = arrayList9.size();
                    int i30 = 0;
                    while (i30 < size3) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList9.get(i30);
                        i30++;
                        arrayList8.add(b5.a(tL_storyAlbum));
                    }
                    arrayList7.clear();
                    arrayList7.addAll(arrayList8);
                    arrayList6.clear();
                    arrayList6.addAll(arrayList8);
                    w4Var2.f = true;
                    w4Var2.e = false;
                    w4Var2.f(true);
                    break;
                } else if (tLObject2 instanceof TL_stories.TL_albumsNotModified) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList6);
                    w4Var2.f = true;
                    w4Var2.e = false;
                    NotificationCenter.getInstance(w4Var2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(w4Var2.b), w4Var2);
                    break;
                }
                break;
            case 17:
                a5 a5Var = (a5) this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                a5Var.getClass();
                callback2.run(a5Var);
                break;
            case 18:
                MessagesController.getInstance(((h5) this.b).M.a).getStoriesController().Z((TL_stories.TL_updateStory) this.c);
                break;
            case 19:
                h5 h5Var = (h5) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                r9 r9Var4 = h5Var.c;
                r9Var4.w = true;
                i5 i5Var = h5Var.M;
                if (i5Var.n(tL_error2)) {
                    r9Var4.x = null;
                } else {
                    r9Var4.x = tL_error2;
                }
                h5Var.d = true;
                h5Var.I = true;
                h5Var.H = true;
                i5Var.w.d(r9Var4);
                break;
            case 20:
                h5 h5Var2 = (h5) this.b;
                h5Var2.c.c((File) this.c);
                AndroidUtilities.runOnUIThread(new e5(h5Var2, r8));
                break;
            case 21:
                v5.a((v5) this.b, (zh.m4) this.c);
                break;
            case 22:
                ((zh.m4) this.b).accept((TL_stories.TL_stories_allStories) this.c);
                break;
            case 23:
                v5 v5Var = (v5) this.b;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) this.c;
                MessagesStorage messagesStorage = v5Var.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
                    TL_stories.StoryItem storyItem2 = tL_updateStory.story;
                    int i31 = storyItem2.id;
                    if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                        Locale locale = Locale.US;
                        SQLiteCursor queryFinalized = database.queryFinalized("SELECT data, custom_params FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i31, new Object[0]);
                        if (queryFinalized.next()) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            NativeByteBuffer byteBufferValue2 = queryFinalized.byteBufferValue(1);
                            if (byteBufferValue != null) {
                                t6.a(TL_stories.StoryItem.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true), byteBufferValue2);
                                byteBufferValue.reuse();
                            }
                            if (byteBufferValue2 != null) {
                                byteBufferValue2.reuse();
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        queryFinalized.dispose();
                        database.executeFast("DELETE FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i31).stepThis().dispose();
                        if (z10) {
                            i11 = -1;
                            SQLiteCursor queryFinalized2 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                            r8 = queryFinalized2.next() ? queryFinalized2.intValue(1) : 0;
                            queryFinalized2.dispose();
                            Locale locale2 = Locale.US;
                            database.executeFast("UPDATE stories_counter SET count = " + (r8 + i11) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            break;
                        }
                        i11 = 0;
                        SQLiteCursor queryFinalized22 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized22.next()) {
                        }
                        queryFinalized22.dispose();
                        Locale locale22 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r8 + i11) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    } else {
                        if (storyItem2 instanceof TL_stories.TL_storyItem) {
                            v5Var.l(peerDialogId, storyItem2);
                            Locale locale3 = Locale.US;
                            SQLiteCursor queryFinalized3 = database.queryFinalized("SELECT story_id FROM stories WHERE dialog_id = " + peerDialogId + " AND story_id = " + i31, new Object[0]);
                            boolean next = queryFinalized3.next();
                            queryFinalized3.dispose();
                            if (!next) {
                                i11 = 1;
                                SQLiteCursor queryFinalized222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                                if (queryFinalized222.next()) {
                                }
                                queryFinalized222.dispose();
                                Locale locale222 = Locale.US;
                                database.executeFast("UPDATE stories_counter SET count = " + (r8 + i11) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                            }
                        }
                        i11 = 0;
                        SQLiteCursor queryFinalized2222 = database.queryFinalized("SELECT count, max_read FROM stories_counter WHERE dialog_id = " + peerDialogId, new Object[0]);
                        if (queryFinalized2222.next()) {
                        }
                        queryFinalized2222.dispose();
                        Locale locale2222 = Locale.US;
                        database.executeFast("UPDATE stories_counter SET count = " + (r8 + i11) + " WHERE dialog_id = " + peerDialogId).stepThis().dispose();
                    }
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 24:
                v5 v5Var2 = (v5) this.b;
                zh.m4 m4Var2 = (zh.m4) this.c;
                MessagesStorage messagesStorage2 = v5Var2.b;
                SQLiteDatabase database2 = messagesStorage2.getDatabase();
                LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
                try {
                    SQLiteCursor queryFinalized4 = database2.queryFinalized("SELECT dialog_id, max_read FROM stories_counter", new Object[0]);
                    while (queryFinalized4.next()) {
                        longSparseIntArray.put(queryFinalized4.longValue(0), queryFinalized4.intValue(1));
                    }
                } catch (Exception e) {
                    messagesStorage2.checkSQLException(e);
                }
                AndroidUtilities.runOnUIThread(new q(26, m4Var2, longSparseIntArray));
                break;
            case 25:
                ((v5) this.b).j((ArrayList) this.c);
                break;
            case 26:
                ((zh.m4) this.b).b.f = (LongSparseIntArray) this.c;
                break;
            case 27:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!a1Var.b) {
                    runnable.run();
                    break;
                }
                break;
            case 28:
                Runnable[] runnableArr = (Runnable[]) this.b;
                org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) this.c;
                runnableArr[0] = null;
                ((q) a1Var2.d).run();
                w5 w5Var = (w5) a1Var2.e;
                if (w5Var != null) {
                    w5Var.onDetachedFromWindow();
                    break;
                }
                break;
            default:
                x5 x5Var = (x5) this.b;
                View view = (View) this.c;
                x5Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                xc xcVar = x5Var.H;
                if (xcVar != null) {
                    xcVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                x5Var.N = false;
                x5Var.e();
                break;
        }
    }
}
