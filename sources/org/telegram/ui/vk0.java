package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vk0 extends org.telegram.ui.ActionBar.r2 implements org.telegram.ui.Components.ek, NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public tk0 G;
    public boolean H;
    public final SparseArray I;
    public org.telegram.ui.Components.po J;
    public long K;
    public int L;
    public tk0 M;
    public org.telegram.ui.Components.ti N;
    public Ringtone O;
    public long P;
    public int Q;
    public int R;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.nm0 d;
    public sk0 e;
    public final org.telegram.ui.ActionBar.u6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public int y;

    public vk0(Bundle bundle, org.telegram.ui.ActionBar.u6 u6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.F = 100;
        this.I = new SparseArray();
        this.L = -1;
        this.P = 0L;
        this.f = u6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:15:0x0051, B:17:0x0058, B:21:0x0073, B:23:0x0077, B:25:0x007b, B:26:0x0094, B:28:0x0098, B:30:0x009e, B:34:0x00b1, B:36:0x00bf, B:38:0x00c5, B:39:0x00de), top: B:14:0x0051 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void V(vk0 vk0Var, Context context, View view, int i10) {
        vk0 vk0Var2;
        Context context2;
        File file;
        if (i10 == vk0Var.s) {
            vk0Var2 = vk0Var;
            context2 = context;
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(context2, vk0Var2, false, false, true, vk0Var.f);
            vk0Var2.N = tiVar;
            tiVar.N = true;
            tiVar.A1.setVisibility(8);
            tiVar.m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            vk0Var2.N.w1();
            vk0Var2.N.show();
        } else {
            vk0Var2 = vk0Var;
            context2 = context;
        }
        if (view instanceof uk0) {
            uk0 uk0Var = (uk0) view;
            if (vk0Var2.simpleActionBar.o() || uk0Var.e == null) {
                vk0Var2.a0(uk0Var.e);
                return;
            }
            Ringtone ringtone = vk0Var2.O;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                tk0 tk0Var = uk0Var.e;
                if (tk0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    vk0Var2.O = ringtone2;
                    ringtone2.play();
                } else {
                    String str = tk0Var.g;
                    if (str != null && !tk0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(uk0Var.e.g));
                        ringtone3.setStreamType(4);
                        vk0Var2.O = ringtone3;
                        ringtone3.play();
                    } else if (tk0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(uk0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    file = vk0Var2.getFileLoader().getPathToAttach(uk0Var.e.e);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    vk0Var2.O = ringtone4;
                                    ringtone4.play();
                                } else {
                                    FileLoader fileLoader = vk0Var2.getFileLoader();
                                    TLRPC.Document document = uk0Var.e.e;
                                    fileLoader.loadFile(document, document, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        FileLoader fileLoader2 = vk0Var2.getFileLoader();
                        TLRPC.Document document2 = uk0Var.e.e;
                        fileLoader2.loadFile(document2, document2, 3, 0);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            vk0Var2.M = null;
            vk0Var2.G = uk0Var.e;
            vk0Var2.H = true;
            sk0 sk0Var = vk0Var2.e;
            sk0Var.q(0, sk0Var.c.h);
        }
    }

    public static void X(vk0 vk0Var) {
        vk0Var.I.clear();
        sk0 sk0Var = vk0Var.e;
        sk0Var.q(0, sk0Var.c.h);
        vk0Var.d0();
    }

    public static void b0(View view, int i10, int i11) {
        if (view instanceof org.telegram.ui.Cells.e2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            for (int i12 = 0; i12 < e2Var.getChildCount(); i12++) {
                View childAt = e2Var.getChildAt(i12);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.ar) {
                        org.telegram.ui.Components.ar arVar = (org.telegram.ui.Components.ar) imageView.getDrawable();
                        Drawable drawable = arVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = arVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String c0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : LocaleController.formatString("SoundNameEmpty", R.string.SoundNameEmpty, LocaleController.formatDateChat(document.date, true));
    }

    public final void a0(tk0 tk0Var) {
        int i10 = tk0Var.c;
        SparseArray sparseArray = this.I;
        if (sparseArray.get(i10) != null) {
            sparseArray.remove(tk0Var.c);
        } else if (!tk0Var.a) {
            return;
        } else {
            sparseArray.put(tk0Var.c, tk0Var);
        }
        d0();
        sk0 sk0Var = this.e;
        sk0Var.q(0, sk0Var.c.h);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new rk0(this, context));
        if (this.K == 0) {
            int i10 = this.L;
            if (i10 == 1) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundPrivate));
            } else if (i10 == 0) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundGroup));
            } else if (i10 == 2) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundChannels));
            } else if (i10 == 3) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundStories));
            } else if (i10 == 5 || i10 == 4) {
                this.simpleActionBar.setTitle(LocaleController.getString(R.string.NotificationsSoundReactions));
            }
        } else {
            this.J = new org.telegram.ui.Components.po(context, null, false, this.f);
            if (this.K >= 0) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.K));
                if (user != null) {
                    this.J.setUserAvatar(user);
                    this.simpleActionBar.setTitle(ContactsController.formatName(user.first_name, user.last_name));
                }
            } else if (this.P != 0) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.K, this.P);
                pg.d.p(this.J.getAvatarImageView(), findTopic, false, true, this.f);
                this.simpleActionBar.setTitle(findTopic.title);
            } else {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.K));
                this.J.setChatAvatar(chat);
                this.simpleActionBar.setTitle(chat.title);
            }
            this.simpleActionBar.setSubtitle(LocaleController.getString(R.string.NotificationsSound));
            AndroidUtilities.removeFromParent(this.J.e);
            this.simpleActionBar.addView(this.J.e, org.telegram.ui.Components.kb1.h(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.x5 h = this.simpleActionBar.h();
        h.c(2, R.drawable.msg_forward, LocaleController.getString(R.string.ShareFile), AndroidUtilities.dp(54.0f));
        h.c(1, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.d = nm0Var;
        nm0Var.u1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        sk0 sk0Var = new sk0(this);
        this.e = sk0Var;
        sk0Var.C(true);
        this.d.setAdapter(this.e);
        ((s4.l) this.d.getItemAnimator()).m = false;
        ((s4.l) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new s4.c0());
        this.d.setOnItemClickListener(new di.x4(20, this, context));
        this.d.setOnItemLongClickListener(new st(this, 28));
        getMediaDataController().ringtoneDataStore.g(false);
        this.a.clear();
        this.b.clear();
        for (int i11 = 0; i11 < getMediaDataController().ringtoneDataStore.e.size(); i11++) {
            xf.b bVar = (xf.b) getMediaDataController().ringtoneDataStore.e.get(i11);
            tk0 tk0Var = new tk0();
            int i12 = this.F;
            this.F = i12 + 1;
            tk0Var.c = i12;
            tk0Var.a = true;
            tk0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            tk0Var.f = str;
            tk0Var.e = document3;
            tk0Var.f = c0(document3, str);
            tk0Var.g = bVar.b;
            tk0 tk0Var2 = this.M;
            if (tk0Var2 != null && (document = tk0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.M = null;
                this.G = tk0Var;
            }
            this.a.add(tk0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(ApplicationLoader.applicationContext);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        tk0 tk0Var3 = new tk0();
        int i13 = this.F;
        this.F = i13 + 1;
        tk0Var3.c = i13;
        tk0Var3.f = LocaleController.getString(R.string.NoSound);
        this.b.add(tk0Var3);
        tk0 tk0Var4 = new tk0();
        int i14 = this.F;
        this.F = i14 + 1;
        tk0Var4.c = i14;
        tk0Var4.f = LocaleController.getString(R.string.DefaultRingtone);
        tk0Var4.b = true;
        this.b.add(tk0Var4);
        tk0 tk0Var5 = this.M;
        if (tk0Var5 != null && tk0Var5.e == null && tk0Var5.g.equals("NoSound")) {
            this.M = null;
            this.G = tk0Var3;
        }
        tk0 tk0Var6 = this.M;
        if (tk0Var6 != null && tk0Var6.e == null && tk0Var6.g.equals("Default")) {
            this.M = null;
            this.G = tk0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            tk0 tk0Var7 = new tk0();
            int i15 = this.F;
            this.F = i15 + 1;
            tk0Var7.c = i15;
            tk0Var7.f = string;
            tk0Var7.g = str2;
            tk0 tk0Var8 = this.M;
            if (tk0Var8 != null && tk0Var8.e == null && tk0Var8.g.equals(str2)) {
                this.M = null;
                this.G = tk0Var7;
            }
            this.b.add(tk0Var7);
        }
        if (getMediaDataController().ringtoneDataStore.f && this.G == null) {
            this.G = tk0Var4;
            this.H = true;
        }
        e0();
        e0();
        return this.fragmentView;
    }

    public final void d0() {
        SparseArray sparseArray = this.I;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.n();
        } else {
            this.simpleActionBar.t(sparseArray.size(), this.simpleActionBar.o());
            this.simpleActionBar.x();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i10 == NotificationCenter.onUserRingtonesUpdated) {
            HashMap hashMap = new HashMap();
            int i12 = 0;
            while (true) {
                arrayList = this.a;
                if (i12 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((tk0) arrayList.get(i12)).d), (tk0) arrayList.get(i12));
                i12++;
            }
            arrayList.clear();
            for (int i13 = 0; i13 < getMediaDataController().ringtoneDataStore.e.size(); i13++) {
                xf.b bVar = (xf.b) getMediaDataController().ringtoneDataStore.e.get(i13);
                tk0 tk0Var = new tk0();
                tk0 tk0Var2 = (tk0) hashMap.get(Integer.valueOf(bVar.c));
                if (tk0Var2 != null) {
                    if (tk0Var2 == this.G) {
                        this.G = tk0Var;
                    }
                    tk0Var.c = tk0Var2.c;
                } else {
                    int i14 = this.F;
                    this.F = i14 + 1;
                    tk0Var.c = i14;
                }
                tk0Var.a = true;
                tk0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    tk0Var.f = document3.file_name_fixed;
                } else {
                    tk0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                tk0Var.e = document4;
                tk0Var.f = c0(document4, tk0Var.f);
                tk0Var.g = bVar.b;
                tk0 tk0Var3 = this.M;
                if (tk0Var3 != null && (document = tk0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.M = null;
                    this.G = tk0Var;
                }
                arrayList.add(tk0Var);
            }
            e0();
            this.e.l();
            if (getMediaDataController().ringtoneDataStore.f && this.G == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.M = null;
                    this.G = (tk0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0() {
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.v = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.h = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i10 = this.h;
            this.n = i10;
            int size = arrayList.size() + i10;
            this.h = size;
            this.r = size;
        }
        int i11 = this.h;
        this.s = i11;
        this.h = i11 + 2;
        this.v = i11 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i12 = this.h;
            int i13 = i12 + 1;
            this.h = i13;
            this.x = i12;
            this.y = i13;
            int size2 = arrayList2.size() + i13;
            this.h = size2;
            this.E = size2;
        }
        int i14 = this.h;
        this.h = i14 + 1;
        this.w = i14;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            getMediaDataController().uploadRingtone((String) arrayList.get(i11));
        }
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i10 != 21 || intent == null || this.N == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = false;
        if (intent.getData() != null) {
            String path = AndroidUtilities.getPath(intent.getData());
            if (path != null) {
                if (path.startsWith("content://")) {
                    path = MediaController.copyFileToCache(intent.getData(), "mp3");
                }
                if (this.N.p0.P(new File(path))) {
                    getMediaDataController().uploadRingtone(path);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z11 = z10;
                }
            }
            z10 = false;
            z11 = z10;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z12 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.copyFileToCache(uri, "mp3");
                }
                if (this.N.p0.P(new File(uri2))) {
                    getMediaDataController().uploadRingtone(uri2);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.N.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.K = getArguments().getLong("dialog_id", 0L);
            this.P = getArguments().getLong("topic_id", 0L);
            this.L = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j10 = this.K;
        if (j10 != 0) {
            String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, this.P);
            str2 = org.telegram.ui.Components.b10.j("sound_document_id_", sharedPrefKey);
            str = org.telegram.ui.Components.b10.j("sound_path_", sharedPrefKey);
        } else {
            int i10 = this.L;
            if (i10 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j11 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        tk0 tk0Var = new tk0();
        this.M = tk0Var;
        if (j11 != 0) {
            tk0Var.e = new TLRPC.TL_document();
            this.M.e.id = j11;
        } else {
            tk0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.G == null || !this.H) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.K != 0) {
            str = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_"));
            str2 = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_path_"));
            str3 = org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_document_id_"));
            edit.putBoolean(org.telegram.messenger.t.j(this.K, this.P, new StringBuilder("sound_enabled_")), true);
        } else {
            int i10 = this.L;
            if (i10 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i10 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i10 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i10 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i10 != 5 && i10 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        tk0 tk0Var = this.G;
        if (tk0Var.a && (document = tk0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.G.f);
            edit.putString(str2, "NoSound");
        } else if (tk0Var.g != null) {
            edit.putString(str, tk0Var.f);
            edit.putString(str2, this.G.g);
            edit.remove(str3);
        } else if (tk0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.K != 0) {
            getNotificationsController().updateServerNotificationsSettings(this.K, this.P);
        } else {
            getNotificationsController().updateServerNotificationsSettings(this.L);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().addWeakObserver(this, NotificationCenter.onUserRingtonesUpdated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.u6 u6Var = this.f;
        try {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var);
            int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.k7, u6Var);
            if (this.d != null) {
                if (w02 == this.Q && w03 == this.R) {
                    return;
                }
                this.Q = w02;
                this.R = w03;
                for (int i10 = 0; i10 < this.d.getChildCount(); i10++) {
                    b0(this.d.getChildAt(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getCachedChildCount(); i11++) {
                    b0(this.d.P(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getHiddenChildCount(); i12++) {
                    b0(this.d.V(i12), w02, w03);
                }
                for (int i13 = 0; i13 < this.d.getAttachedScrapChildCount(); i13++) {
                    b0(this.d.O(i13), w02, w03);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void P() {
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
