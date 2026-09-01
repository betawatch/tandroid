package qh;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.mg1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class k6 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, xd.b {
    public boolean A0;
    public TLRPC.User B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public String F0;
    public int G0;
    public final e6 H0;
    public boolean I0;
    public final ArrayList J0;
    public final RectF K0;
    public final ArrayList L0;
    public final xd.a U;
    public final int V;
    public boolean W;
    public final k6 X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList a0;
    public final MessagesController.SavedMusicList b0;
    public final Utilities.Callback c0;
    public MessageObject d0;
    public boolean e0;
    public boolean f0;
    public final FrameLayout g0;
    public final li h0;
    public final og.e i0;
    public final tg.d j0;
    public final tg.d k0;
    public final og.a l0;
    public final lh.n2 m0;
    public x51 n0;
    public MessageObject o0;
    public String p0;
    public int q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public String u0;
    public int v0;
    public final e6 w0;
    public String x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: Type inference failed for: r2v2, types: [qh.e6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [qh.e6] */
    public k6(Context context, boolean z4, k6 k6Var, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, true, false, false, 2, g6Var);
        pr prVar = pr.h;
        this.U = new xd.a(0, this, prVar, 380L, false);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.v0 = -1;
        final int i10 = 0;
        this.w0 = new Runnable(this) { // from class: qh.e6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.b0();
                        break;
                    case 1:
                        this.b.a0();
                        break;
                    default:
                        k6.S(this.b);
                        break;
                }
            }
        };
        this.E0 = -1;
        this.G0 = -2000000000;
        final int i11 = 1;
        this.H0 = new Runnable(this) { // from class: qh.e6
            public final /* synthetic */ k6 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.b0();
                        break;
                    case 1:
                        this.b.a0();
                        break;
                    default:
                        k6.S(this.b);
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.J0 = arrayList;
        RectF rectF = new RectF();
        this.K0 = rectF;
        arrayList.add(rectF);
        this.L0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        J();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-20.0f);
        this.W = z4;
        this.V = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.X = k6Var;
        this.c0 = callback;
        tg.c cVar = new tg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.i0 = new og.e(false);
            tg.d dVar = new tg.d(null);
            this.k0 = dVar;
            dVar.j(new f6(this));
            tg.d dVar2 = new tg.d(null);
            this.j0 = dVar2;
            dVar2.j(new g6(this));
            og.a aVar = new og.a(dVar);
            this.l0 = aVar;
            aVar.f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.i0 = null;
            this.j0 = null;
            this.k0 = null;
            this.l0 = new og.a(cVar);
        }
        this.m0 = new lh.n2(this, 1);
        int i12 = org.telegram.ui.ActionBar.k6.a7;
        li liVar = new li(context, i12, g6Var);
        this.h0 = liVar;
        liVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g0 = frameLayout;
        d20 d20Var = new d20(context, g6Var);
        d20Var.r.setOnFocusChangeListener(new h6(this));
        d20Var.w = true;
        d20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        d20Var.e();
        d20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        d20Var.r.addTextChangedListener(new i6(this));
        d20Var.r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(liVar, k7.c6.g());
        frameLayout.addView(d20Var, k7.c6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        d20Var.setupBlurredBackground(this.l0.c(d20Var, sg.b.m(g6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, k7.c6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        tl0 tl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i13, 0, i13, 0);
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(prVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (z4) {
            this.b0 = null;
            if (this.W && !this.I0) {
                this.I0 = true;
                final int i14 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) { // from class: qh.e6
                    public final /* synthetic */ k6 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.b.b0();
                                break;
                            case 1:
                                this.b.a0();
                                break;
                            default:
                                k6.S(this.b);
                                break;
                        }
                    }
                });
            }
        } else {
            int i15 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i15, UserConfig.getInstance(i15).getClientUserId());
            this.b0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        }
        this.d.setOnScrollListener(new j6(this));
        this.d.setOnItemClickListener(new oh.d0(this, callback, g6Var, 2));
    }

    public static /* synthetic */ void P(k6 k6Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = k6Var.a0;
        boolean z4 = false;
        k6Var.z0 = false;
        k6Var.A0 = false;
        if (messages_botresults == null) {
            k6Var.n0.N(true);
            return;
        }
        MessagesController.getInstance(k6Var.currentAccount).putUsers(messages_botresults.users, false);
        ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.BotInlineResult botInlineResult = arrayList2.get(i10);
            i10++;
            TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                if (tL_botInlineMediaResult.document != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i11 = k6Var.G0;
                    k6Var.G0 = i11 - 1;
                    tL_message.id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(k6Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(k6Var.currentAccount, tL_message, false, true));
                }
            }
        }
        k6Var.x0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(k6Var.x0)) {
            z4 = true;
        }
        k6Var.y0 = z4;
        k6Var.n0.N(true);
    }

    public static void Q(k6 k6Var, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.h7)) {
            j51 G = k6Var.n0.G(i10 - 1);
            if (G != null && G.d == 1) {
                new k6(k6Var.getContext(), true, k6Var, callback, g6Var).show();
                return;
            }
            if (G != null && G.d == 2) {
                k6Var.b0.load();
                return;
            }
            if (G != null && G.d == 3) {
                k6Var.b0();
                return;
            } else {
                if (G == null || G.d != 4) {
                    return;
                }
                k6Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.h7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(k6Var.currentAccount).removeLoadingFileObserver(k6Var);
        if (k6Var.d0 != null) {
            FileLoader.getInstance(k6Var.currentAccount).cancelLoadFile(k6Var.d0.getDocument());
            k6Var.d0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            k6Var.c0.run(message);
            k6 k6Var2 = k6Var.X;
            if (k6Var2 != null) {
                k6Var2.dismiss();
            }
            k6Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        k6Var.d0 = message;
        DownloadController.getInstance(k6Var.currentAccount).addLoadingFileObserver(fileName, message, k6Var);
        FileLoader.getInstance(k6Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static /* synthetic */ void R(k6 k6Var, TLObject tLObject) {
        ArrayList arrayList = k6Var.Z;
        boolean z4 = false;
        k6Var.t0 = false;
        k6Var.s0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(k6Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(k6Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(k6Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z4 = true;
            }
            k6Var.r0 = z4;
            k6Var.q0 = messages_messages.next_rate;
        } else {
            k6Var.r0 = false;
            k6Var.q0 = 0;
        }
        k6Var.n0.N(true);
    }

    public static /* synthetic */ void S(k6 k6Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                try {
                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                    audioEntry.id = query.getInt(0);
                    audioEntry.author = query.getString(1);
                    audioEntry.title = query.getString(2);
                    audioEntry.path = query.getString(3);
                    audioEntry.duration = (int) (query.getLong(4) / 1000);
                    audioEntry.genre = query.getString(5);
                    File file = new File(audioEntry.path);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.id = i10;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(k6Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    tL_message.attachPath = audioEntry.path;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    tL_message.flags |= 768;
                    String fileExtension = FileLoader.getFileExtension(file);
                    TLRPC.Document document = tL_message.media.document;
                    document.id = 0L;
                    document.access_hash = 0L;
                    document.file_reference = new byte[0];
                    document.date = tL_message.date;
                    StringBuilder sb = new StringBuilder();
                    sb.append("audio/");
                    if (fileExtension.length() <= 0) {
                        fileExtension = "mp3";
                    }
                    sb.append(fileExtension);
                    document.mime_type = sb.toString();
                    tL_message.media.document.size = (int) file.length();
                    tL_message.media.document.dc_id = 0;
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.duration = audioEntry.duration;
                    tL_documentAttributeAudio.title = audioEntry.title;
                    tL_documentAttributeAudio.performer = audioEntry.author;
                    tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = file.getName();
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    MessageObject messageObject = new MessageObject(k6Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } finally {
                }
            }
            query.close();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        AndroidUtilities.runOnUIThread(new mg1(29, k6Var, arrayList));
    }

    public static /* synthetic */ void T(k6 k6Var, Long l10) {
        k6Var.C0 = false;
        TLRPC.User user = l10 == null ? null : MessagesController.getInstance(k6Var.currentAccount).getUser(l10);
        k6Var.B0 = user;
        k6Var.D0 = user == null;
        if (user != null) {
            k6Var.a0();
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.y3.w(" ", str, lowerCase)) {
            return true;
        }
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        return translitSafe.startsWith(str2) || org.telegram.messenger.y3.w(" ", str2, translitSafe);
    }

    @Override // org.telegram.ui.Components.sa
    public final void H(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.i0 != null) {
            X();
            tg.d dVar = this.j0;
            if (dVar != null) {
                dVar.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            tg.d dVar2 = this.k0;
            if (dVar2 != null) {
                dVar2.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.H(canvas, view);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            li liVar = this.h0;
            liVar.setAlpha(f10);
            liVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    public final int W(boolean z4, ArrayList arrayList, String str, ArrayList arrayList2, boolean z10, boolean z11, int i10) {
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z10)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.p0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z4) {
                    messageObject.setQuery(this.p0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.Z) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.p0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z10) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(j51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                }
                this.n0.U();
                arrayList.add(j51.t(str));
                int size2 = arrayList3.size();
                while (true) {
                    int i14 = 4;
                    if (i12 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    eg.y yVar = new eg.y(this, i14);
                    int i15 = org.telegram.ui.Cells.g7.a;
                    j51 J = j51.J(org.telegram.ui.Cells.g7.class);
                    J.G = (MessageObject) obj2;
                    J.H = yVar;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z10) {
                    arrayList.add(j51.n(4));
                    arrayList.add(j51.n(4));
                    arrayList.add(j51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z11 && !z10) {
                    j51 c3 = j51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c3.q = true;
                    arrayList.add(c3);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.n0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.i0) == null) {
            return;
        }
        this.K0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.J0;
        ArrayList arrayList2 = this.L0;
        eVar.g(lf.l0.a(arrayList, 1, arrayList2), arrayList2);
        eVar.e(this.m0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Y() {
        if (this.E0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.E0, true);
        }
        this.E0 = -1;
        this.x0 = "";
        this.y0 = false;
        this.a0.clear();
        this.z0 = false;
        this.A0 = false;
    }

    public final void Z() {
        if (this.v0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.v0, true);
        }
        this.v0 = -1;
        this.q0 = 0;
        this.Z.clear();
        this.s0 = false;
        this.t0 = false;
    }

    public final void a0() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.F0;
        String str4 = this.p0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            Y();
        }
        if (this.z0 || TextUtils.isEmpty(this.p0) || this.p0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.a0;
        if (arrayList.isEmpty() || this.y0) {
            if (this.B0 == null) {
                this.B0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.B0 == null) {
                if (this.C0 || this.D0) {
                    return;
                }
                this.C0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ng.i(this, 6));
                return;
            }
            this.z0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.B0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.x0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.p0;
            String str6 = str5 != null ? str5 : "";
            this.F0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.E0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new c6(this, 1));
            this.n0.N(true);
        }
    }

    public final void b0() {
        if (this.W) {
            return;
        }
        String str = this.u0;
        String str2 = this.p0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Z();
        }
        if (this.s0) {
            return;
        }
        ArrayList arrayList = this.Z;
        if (arrayList.isEmpty() || this.r0) {
            this.s0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.p0;
            String str4 = str3 != null ? str3 : "";
            this.u0 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.q0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.v0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new gf.a(this, 16));
            this.n0.N(true);
        }
    }

    public final void d0() {
        float f10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            tl0 tl0Var = this.d;
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        this.g0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10));
        this.U.a(f10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.n0.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        if (this.o0 != null && MediaController.getInstance().isPlayingMessage(this.o0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.o0 = null;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.V;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.d0;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        this.c0.run(this.d0);
        k6 k6Var = this.X;
        if (k6Var != null) {
            k6Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.sa
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, false, new c6(this, 0), this.resourcesProvider);
        this.n0 = x51Var;
        x51Var.r = false;
        return x51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
