// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p42 extends a22 {
    public final o42 E;
    public final l32 F;
    public final r7 G;
    public final r7 H;
    public final uh4 I;
    public AnimatorSet J;
    public final tk4 K;
    public boolean L;
    public final c42 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public f42 R;
    public final HashMap S;
    public final ArrayList T;
    public final HashMap U;
    public boolean V;
    public int W;
    public boolean a0;
    public final boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public final zk f0;
    public ValueAnimator g0;
    public byte n;
    public final d42 r;
    public final d42 s;
    public final h42 w;
    public final h42 x;
    public final wd4 y;

    public p42(int i, i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        Cursor cursor;
        final byte b = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        int i2 = 3;
        this.f0 = new zk(this, (byte) 3);
        h42 h42Var = new h42(this, context);
        this.w = h42Var;
        final byte b2 = 1;
        this.b0 = i == 1;
        byte b3 = 2;
        boolean z = i == 2;
        this.e0 = z;
        this.d0 = gda.I0;
        try {
            if (z) {
                try {
                    Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "duration", "_size", "mime_type"}, "is_music != 0", null, "date_added DESC");
                    while (query.moveToNext()) {
                        try {
                            File file = new File(query.getString(1));
                            long j = query.getLong(2);
                            long j2 = query.getLong(i2);
                            String string = query.getString(4);
                            cursor = query;
                            if (j <= oc7.r1(z8c.t0).l4.S0.f() * 1000) {
                                try {
                                    if (j2 <= oc7.r1(z8c.t0).l4.R0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        i42 i42Var = new i42();
                                        i42Var.b = file.getName();
                                        i42Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        i42Var.d = split.length > 1 ? split[split.length - 1] : "?";
                                        i42Var.c = gm.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            i42Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(i42Var);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (cursor == null) {
                                        throw th2;
                                    }
                                    try {
                                        cursor.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            }
                            query = cursor;
                            i2 = 3;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = query;
                        }
                    }
                    query.close();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) h42Var.h, new z32(this, (byte) 1));
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        this.c0 = false;
        if (!this.Q) {
            this.Q = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
            intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
            intentFilter.addAction("android.intent.action.MEDIA_EJECT");
            intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
            intentFilter.addAction("android.intent.action.MEDIA_NOFS");
            intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
            intentFilter.addAction("android.intent.action.MEDIA_SHARED");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
            intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
            intentFilter.addDataScheme("file");
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(this.f0, intentFilter, 4);
            } else {
                a.b.registerReceiver(this.f0, intentFilter);
            }
        }
        r6 t = this.b.U2.t();
        r7 a = t.a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new q20(this, b3);
        this.G = a;
        a.setSearchFieldHint(jb6.M0(2131745570, null));
        a.setContentDescription(jb6.M0(2131745570, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i3 = cmb.i5;
        anb.X(searchField, i3, ylbVar);
        anb.v(searchField, i3, ylbVar);
        anb.D(searchField, cmb.Le, ylbVar);
        r7 a2 = t.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a2;
        a2.setContentDescription(jb6.M0(2131754891, null));
        tk4 tk4Var = new tk4(context, ylbVar);
        this.K = tk4Var;
        addView(tk4Var);
        c42 c42Var = new c42(this, context, tk4Var, ylbVar);
        this.M = c42Var;
        addView(c42Var, qoe.c(-1.0f, -1));
        c42Var.setVisibility(8);
        c42Var.setOnTouchListener(new w02((byte) 1));
        d42 d42Var = new d42(this, context, ylbVar, (byte) 0);
        this.s = d42Var;
        d42Var.setSectionsType(2);
        d42Var.setVerticalScrollBarEnabled(false);
        wd4 wd4Var = new wd4(gm.L(56.0f), 0, d42Var);
        this.y = wd4Var;
        d42Var.setLayoutManager(wd4Var);
        d42Var.setClipToPadding(false);
        h42 h42Var2 = new h42(this, context);
        this.x = h42Var2;
        d42Var.setAdapter(h42Var2);
        addView(d42Var, qoe.c(-1.0f, -1));
        d42Var.setVisibility(8);
        d42 d42Var2 = new d42(this, context, ylbVar, (byte) 1);
        this.r = d42Var2;
        d42Var2.r1();
        setBlur3Capture(d42Var2);
        this.d = d42Var2;
        this.h = true;
        this.f = true;
        d42Var2.setSectionsType(2);
        d42Var2.setVerticalScrollBarEnabled(false);
        l32 l32Var = new l32(this, gm.L(56.0f) + gm.m, d42Var2, b2);
        this.F = l32Var;
        d42Var2.setLayoutManager(l32Var);
        d42Var2.setClipToPadding(false);
        d42Var2.setAdapter(this.w);
        addView(d42Var2, qoe.c(-1.0f, -1));
        this.E = new o42(this, context);
        d42Var2.setOnScrollListener(new y(this, (byte) 20));
        d42Var2.setOnItemClickListener(new f59(this) { // from class: x32
            public final /* synthetic */ p42 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i4, View view) {
                byte b4 = b;
                p42 p42Var = this.b;
                switch (b4) {
                    case 0:
                        p42Var.Q(i4, view);
                        break;
                    default:
                        uh4 uh4Var = p42Var.I;
                        uh4Var.J0(true);
                        o42 o42Var = p42Var.E;
                        ArrayList arrayList = uh4Var.f3;
                        sh4 sh4Var = arrayList.isEmpty() ? uh4.k3[i4] : (sh4) arrayList.get(i4);
                        i22 i22Var2 = o42Var.Y.b;
                        ArrayList arrayList2 = o42Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (sh4Var.b((sh4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(sh4Var);
                        i22Var2.U2.setSearchFilter(sh4Var);
                        i22Var2.U2.setSearchFieldText("");
                        o42Var.a0(null, null, true);
                        break;
                }
            }
        });
        d42Var2.setOnItemLongClickListener(new cd1((Object) this, (byte) 17));
        uh4 uh4Var = new uh4(context, ylbVar);
        this.I = uh4Var;
        uh4Var.setOnItemClickListener(new f59(this) { // from class: x32
            public final /* synthetic */ p42 b;

            {
                this.b = this;
            }

            @Override // f59
            public final void g(int i4, View view) {
                byte b4 = b2;
                p42 p42Var = this.b;
                switch (b4) {
                    case 0:
                        p42Var.Q(i4, view);
                        break;
                    default:
                        uh4 uh4Var2 = p42Var.I;
                        uh4Var2.J0(true);
                        o42 o42Var = p42Var.E;
                        ArrayList arrayList = uh4Var2.f3;
                        sh4 sh4Var = arrayList.isEmpty() ? uh4.k3[i4] : (sh4) arrayList.get(i4);
                        i22 i22Var2 = o42Var.Y.b;
                        ArrayList arrayList2 = o42Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (sh4Var.b((sh4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(sh4Var);
                        i22Var2.U2.setSearchFilter(sh4Var);
                        i22Var2.U2.setSearchFieldText("");
                        o42Var.a0(null, null, true);
                        break;
                }
            }
        });
        anb.h(cmb.g5, ylbVar, uh4Var);
        addView(uh4Var, qoe.e(-1, 44, 48));
        uh4Var.setTranslationY(-gm.L(44.0f));
        uh4Var.setVisibility(4);
        S();
        a0();
        Y();
    }

    private int getTopForScroll() {
        d42 d42Var = this.r;
        View childAt = d42Var.getChildAt(0);
        u69 G = d42Var.G(childAt);
        int i = -d42Var.getPaddingTop();
        return (G == null || G.b() != 0) ? i : childAt.getTop() + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // a22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i, int i2) {
        int L;
        int i3;
        i22 i22Var = this.b;
        if (i22Var.U2.o0 || i22Var.o3.Q() > gm.L(20.0f)) {
            L = gm.L(56.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - gm.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - gm.L(1.0f);
            if (L < 0) {
            }
            i22Var.r0 = true;
        }
        this.r.q1(0, L + gm.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
    }

    @Override // a22
    public final void C() {
        h42 h42Var = this.w;
        if (h42Var != null) {
            h42Var.f();
        }
        o42 o42Var = this.E;
        if (o42Var != null) {
            o42Var.f();
        }
    }

    @Override // a22
    public final void H(a22 a22Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        S();
        a0();
        Y();
        this.b.U2.setTitle(jb6.M0(2131745391, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override // a22
    public final void J() {
        this.r.z0(0);
    }

    @Override // a22
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((k47) hashMap.get((ug4) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        i22 i22Var = this.b;
        CharSequence[] charSequenceArr = {i22Var.U0().getText()};
        final ArrayList Y = hs6.d0(i22Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return ik.Y(i22Var.G3, i22Var.V0(), i22Var.R0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new qac() { // from class: a42
            @Override // qac
            public final void a(Object obj) {
                p42 p42Var = p42.this;
                p42Var.L = true;
                p42Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                p42Var.b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        File[] listFiles = file.listFiles();
        File j = bc4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j)) {
                    i42 i42Var = new i42();
                    i42Var.b = file2.getName();
                    i42Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    i42Var.d = split.length > 1 ? split[split.length - 1] : "?";
                    i42Var.c = gm.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        i42Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(i42Var);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(bc4.D(file));
        if (file.length() == 0 || mimeTypeFromExtension == null || !kl9.i.contains(mimeTypeFromExtension)) {
            new c41(this.b.c, null).u(jb6.a0("InvalidFormatError", null, 2131748938, new Object[0]), jb6.M0(2131751040, null), null).j();
            return false;
        }
        if (file.length() > oc7.r1(z8c.t0).l4.R0.f()) {
            new c41(this.b.c, null).u(jb6.a0("TooLargeError", null, 2131743728, new Object[0]), jb6.a0("ErrorRingtoneSizeTooBig", null, 2131751039, Integer.valueOf(oc7.r1(z8c.t0).l4.R0.f() / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i <= oc7.r1(z8c.t0).l4.S0.f() * 1000) {
            return true;
        }
        new c41(this.b.c, null).u(jb6.a0("TooLongError", null, 2131743727, new Object[0]), jb6.a0("ErrorRingtoneDurationTooLong", null, 2131751041, Integer.valueOf(oc7.r1(z8c.t0).l4.S0.f())), null).j();
        return false;
    }

    public final void Q(int i, View view) {
        Object O;
        int i2;
        d42 d42Var = this.r;
        y59 adapter = d42Var.getAdapter();
        h42 h42Var = this.w;
        if (adapter == h42Var) {
            O = h42Var.E(i);
        } else {
            o42 o42Var = this.E;
            O = o42Var.O(o42Var.S(i), o42Var.Q(i));
        }
        if (!(O instanceof i42)) {
            T(view, O);
            return;
        }
        i42 i42Var = (i42) O;
        File file = i42Var.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        boolean z = e21.b;
        i22 i22Var = this.b;
        if (!z && (((i2 = i42Var.a) == R.drawable.files_storage || i2 == R.drawable.files_internal) && !isExternalStorageManager)) {
            v12 v12Var = i22Var.o3;
            int i3 = i22Var.G3;
            if (i22Var.E3 == null || i22Var.E1 - i22Var.F1 >= 0) {
                this.R.y();
                return;
            } else if (oc7.r1(i3).H3() || oc7.r1(i3).l4.h1.f() <= i22Var.F1) {
                new c41(v12Var, i22Var.J0).t(jb6.M0(2131743727, null), i22Var.J0).j();
                return;
            } else {
                new c41(v12Var, i22Var.J0).f(oc7.r1(i3).l4.h1.f(), new vr0(i22Var, (byte) 4)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                T(view, i42Var);
                return;
            }
            g42 g42Var = new g42();
            View childAt = d42Var.getChildAt(0);
            u69 G = d42Var.G(childAt);
            if (G != null) {
                G.b();
                childAt.getTop();
                g42Var.a = this.P;
                g42Var.b = i22Var.U2.getTitle();
                U();
                h42Var.f.add(g42Var);
                if (!R(file)) {
                    h42Var.f.remove(g42Var);
                    return;
                } else {
                    W(1);
                    i22Var.U2.setTitle(i42Var.b);
                    return;
                }
            }
            return;
        }
        int i4 = i42Var.a;
        if (i4 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            d dVar = i22Var.Z1;
            yv1 yv1Var = dVar instanceof yv1 ? (yv1) dVar : null;
            w78 w78Var = new w78(0, MediaController.a2, hashMap, arrayList, 0, yv1Var != null, yv1Var, false);
            w78Var.m0 = true;
            w78Var.t0 = new mx6(this, hashMap, arrayList);
            w78Var.k0(this.W, false);
            d dVar2 = i22Var.Z1;
            if (dVar2 != null) {
                dVar2.presentFragment(w78Var);
            } else {
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(w78Var);
                }
            }
            i22Var.a(true);
            return;
        }
        if (i4 == R.drawable.files_music) {
            f42 f42Var = this.R;
            if (f42Var != null) {
                f42Var.S();
                return;
            }
            return;
        }
        int topForScroll = getTopForScroll();
        U();
        g42 g42Var2 = (g42) td4.m(1, h42Var.f);
        i22Var.U2.setTitle(g42Var2.b);
        File file2 = g42Var2.a;
        if (file2 != null) {
            R(file2);
        } else {
            S();
        }
        a0();
        this.F.g1(0, topForScroll);
        W(2);
    }

    public final boolean R(File file) {
        File file2;
        h42 h42Var;
        this.O = false;
        boolean canRead = file.canRead();
        d42 d42Var = this.r;
        String str = null;
        h42 h42Var2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                X(jb6.M0(2131754710, null));
                return false;
            }
            this.P = file;
            h42Var2.e.clear();
            Environment.getExternalStorageState();
            gm.y(d42Var);
            this.V = true;
            h42Var2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                X(jb6.M0(2131743566, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = h42Var2.e;
            ArrayList arrayList2 = h42Var2.f;
            ArrayList arrayList3 = h42Var2.e;
            arrayList.clear();
            File j = bc4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    h42Var = h42Var2;
                } else {
                    i42 i42Var = new i42();
                    i42Var.b = file3.getName();
                    i42Var.f = file3;
                    if (file3.isDirectory()) {
                        i42Var.a = R.drawable.files_folder;
                        i42Var.c = jb6.M0(2131750617, str);
                        h42Var = h42Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        i42Var.d = split.length > 1 ? split[split.length - 1] : "?";
                        h42Var = h42Var2;
                        i42Var.c = gm.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            i42Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(i42Var);
                }
                i++;
                h42Var2 = h42Var;
                str = null;
            }
            h42 h42Var3 = h42Var2;
            i42 i42Var2 = new i42();
            i42Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((g42) b10.f(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    i42Var2.c = jb6.M0(2131750617, null);
                } else {
                    i42Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                i42Var2.c = jb6.M0(2131750617, null);
            }
            i42Var2.a = R.drawable.files_folder;
            i42Var2.f = file2;
            arrayList3.add(0, i42Var2);
            if (this.P != null) {
                Collections.sort(h42Var3.e, new z32(this, (byte) 0));
            }
            a0();
            gm.y(d42Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            h42Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            X(e.getLocalizedMessage());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0174, code lost:
    
        if (r4 == null) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        BufferedReader bufferedReader;
        i22 i22Var;
        int lastIndexOf;
        BufferedReader bufferedReader2 = null;
        this.P = null;
        this.O = false;
        this.w.e.clear();
        HashSet hashSet = new HashSet();
        if (Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) {
            i42 i42Var = new i42();
            if (Environment.isExternalStorageRemovable()) {
                i42Var.b = jb6.M0(2131745574, null);
                i42Var.a = R.drawable.files_internal;
                i42Var.c = jb6.M0(2131750793, null);
            } else {
                i42Var.b = jb6.M0(2131748945, null);
                i42Var.a = R.drawable.files_storage;
                i42Var.c = jb6.M0(2131748947, null);
            }
            i42Var.f = Environment.getExternalStorageDirectory();
            this.w.e.add(i42Var);
            hashSet.add(path);
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/mounts"));
        } catch (Exception e) {
            e = e;
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.contains("vfat") || readLine.contains("/mnt")) {
                            if (e21.a) {
                                fc4.b(readLine);
                            }
                            StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                            stringTokenizer.nextToken();
                            String nextToken = stringTokenizer.nextToken();
                            if (!hashSet.contains(nextToken) && readLine.contains("/dev/block/vold") && !readLine.contains("/mnt/secure") && !readLine.contains("/mnt/asec") && !readLine.contains("/mnt/obb") && !readLine.contains("/dev/mapper") && !readLine.contains("tmpfs")) {
                                if (!new File(nextToken).isDirectory() && (lastIndexOf = nextToken.lastIndexOf(47)) != -1) {
                                    String str = "/storage/" + nextToken.substring(lastIndexOf + 1);
                                    if (new File(str).isDirectory()) {
                                        nextToken = str;
                                    }
                                }
                                hashSet.add(nextToken);
                                try {
                                    i42 i42Var2 = new i42();
                                    if (nextToken.toLowerCase().contains("sd")) {
                                        i42Var2.b = jb6.M0(2131745574, null);
                                    } else {
                                        i42Var2.b = jb6.M0(2131750792, null);
                                    }
                                    i42Var2.c = jb6.M0(2131750793, null);
                                    i42Var2.a = R.drawable.files_internal;
                                    i42Var2.f = new File(nextToken);
                                    this.w.e.add(i42Var2);
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    fc4.g(e, true);
                }
                try {
                    break;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                    }
                }
                throw th;
            }
        }
        bufferedReader.close();
        try {
            File file = new File(a.b.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                i42 i42Var3 = new i42();
                i42Var3.b = "Telegram";
                i42Var3.c = jb6.M0(2131754206, null);
                i42Var3.a = R.drawable.files_folder;
                i42Var3.f = file;
                this.w.e.add(i42Var3);
            }
        } catch (Exception e6) {
            fc4.g(e6, true);
        }
        if (!this.e0 && ((i22Var = this.b) == null || !i22Var.B1)) {
            i42 i42Var4 = new i42();
            i42Var4.b = jb6.M0(2131750417, null);
            i42Var4.c = jb6.M0(2131750410, null);
            i42Var4.a = R.drawable.files_gallery;
            i42Var4.f = null;
            this.w.e.add(i42Var4);
        }
        if (this.b0) {
            i42 i42Var5 = new i42();
            i42Var5.b = jb6.M0(2131753917, null);
            i42Var5.c = jb6.M0(2131748072, null);
            i42Var5.a = R.drawable.files_music;
            i42Var5.f = null;
            this.w.e.add(i42Var5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.O = true;
        }
        gm.y(this.r);
        this.V = true;
        this.w.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean T(View view, Object obj) {
        boolean z;
        boolean z2 = obj instanceof i42;
        ArrayList arrayList = this.T;
        i22 i22Var = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z3 = false;
        if (!z2) {
            if (obj instanceof k47) {
                k47 k47Var = (k47) obj;
                ug4 ug4Var = new ug4(k47Var.e1(), k47.B0(k47Var.k));
                if (hashMap2.containsKey(ug4Var)) {
                    hashMap2.remove(ug4Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(ug4Var, k47Var);
                    z3 = true;
                }
                z = z3;
                if (i22Var.B1) {
                }
            }
            return false;
        }
        i42 i42Var = (i42) obj;
        File file = i42Var.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = i42Var.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z = false;
            } else {
                if (!i42Var.f.canRead()) {
                    X(jb6.M0(2131754710, null));
                    return false;
                }
                if (this.a0 && i42Var.e == null) {
                    X(jb6.a0("PassportUploadNotImage", null, 2131747183, new Object[0]));
                    return false;
                }
                if ((i42Var.f.length() > 2097152000 && !z8c.h(z8c.t0).p()) || i42Var.f.length() > 4194304000L) {
                    i46 i46Var = new i46(6, z8c.t0, null, i22Var.c.getContext(), i22Var.Z1);
                    i46Var.I2 = true;
                    i46Var.w1();
                    i46Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i = this.W;
                    if (size >= i) {
                        X(jb6.a0("PassportUploadMaxReached", null, 2131747184, jb6.G(i, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || P(i42Var.f)) && i42Var.f.length() != 0) {
                    boolean z4 = i22Var.Q2;
                    hashMap.put(absolutePath, i42Var);
                    arrayList.add(absolutePath);
                    z = true;
                }
            }
            this.V = false;
            if (i22Var.B1) {
                if (view instanceof ida) {
                    ((ida) view).b(z, true);
                }
                i22Var.F1(z ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((k47) hashMap2.get((ug4) it.next()));
                }
                this.R.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void U() {
        View m;
        h42 h42Var = this.x;
        h42Var.f.clear();
        ArrayList arrayList = h42Var.f;
        h42 h42Var2 = this.w;
        arrayList.addAll(h42Var2.f);
        ArrayList arrayList2 = h42Var.e;
        arrayList2.clear();
        arrayList2.addAll(h42Var2.e);
        ArrayList arrayList3 = (ArrayList) h42Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) h42Var2.h);
        h42Var.f();
        d42 d42Var = this.s;
        d42Var.setVisibility(0);
        d42 d42Var2 = this.r;
        d42Var.setPadding(d42Var2.getPaddingLeft(), d42Var2.getPaddingTop(), d42Var2.getPaddingRight(), d42Var2.getPaddingBottom());
        l32 l32Var = this.F;
        int K0 = l32Var.K0();
        if (K0 < 0 || (m = l32Var.m(K0)) == null) {
            return;
        }
        this.y.g1(K0, m.getTop() - d42Var.getPaddingTop());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(final int i) {
        d42 d42Var;
        final float L;
        ValueAnimator ofFloat;
        ValueAnimator valueAnimator = this.g0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.n = i;
        int i2 = 0;
        while (true) {
            int childCount = getChildCount();
            d42Var = this.r;
            if (i2 >= childCount) {
                i2 = 0;
                break;
            } else if (getChildAt(i2) == d42Var) {
                break;
            } else {
                i2++;
            }
        }
        d42 d42Var2 = this.s;
        if (i == 1) {
            L = gm.L(150.0f);
            d42Var2.setAlpha(1.0f);
            d42Var2.setScaleX(1.0f);
            d42Var2.setScaleY(1.0f);
            d42Var2.setTranslationX(0.0f);
            removeView(d42Var2);
            addView(d42Var2, i2);
            d42Var2.setVisibility(0);
            d42Var.setTranslationX(L);
            d42Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = gm.L(150.0f);
            d42Var.setAlpha(0.0f);
            d42Var.setScaleX(0.95f);
            d42Var.setScaleY(0.95f);
            d42Var2.setScaleX(1.0f);
            d42Var2.setScaleY(1.0f);
            d42Var2.setTranslationX(0.0f);
            d42Var2.setAlpha(1.0f);
            removeView(d42Var2);
            addView(d42Var2, i2 + 1);
            d42Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y32
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                p42 p42Var = p42.this;
                d42 d42Var3 = p42Var.r;
                d42 d42Var4 = p42Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    d42Var3.setTranslationX(f);
                    d42Var3.setAlpha(1.0f - floatValue);
                    d42Var3.invalidate();
                    d42Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    d42Var4.setScaleX(f2);
                    d42Var4.setScaleY(f2);
                    return;
                }
                d42Var4.setTranslationX(f);
                d42Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                d42Var4.invalidate();
                d42Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                d42Var3.setScaleX(f3);
                d42Var3.setScaleY(f3);
                d42Var4.invalidate();
            }
        });
        this.g0.addListener(new b91((Object) this, (byte) 17));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(d53.f);
        this.g0.start();
    }

    public final void X(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = jb6.M0(R.string.AppName, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = str;
        b10.t(null, 2131747564, alertDialog$Builder, null);
    }

    public final void Y() {
        y59 adapter = this.r.getAdapter();
        boolean z = true;
        o42 o42Var = this.E;
        if (adapter != o42Var ? this.w.b() != 1 : !(o42Var.s.isEmpty() && o42Var.Q.isEmpty())) {
            z = false;
        }
        this.M.setVisibility(z ? 0 : 8);
        Z();
    }

    public final void Z() {
        View childAt;
        c42 c42Var = this.M;
        if (c42Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = c42Var.getTranslationY();
        this.N = (childAt.getTop() + (c42Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        c42Var.setTranslationY(translationY);
    }

    public final void a0() {
        r7 r7Var = this.G;
        if (r7Var == null || r7Var.w()) {
            return;
        }
        r7Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // a22
    public final void d() {
        r7 r7Var = this.G;
        if (r7Var != null) {
            try {
                if (r7Var.getSearchField() != null) {
                    r7Var.getSearchField().setCursorColor(cmb.v0(cmb.i5, this.a));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // a22
    public int getButtonsHideOffset() {
        return gm.L(62.0f);
    }

    @Override // a22
    public int getCurrentItemTop() {
        d42 d42Var = this.r;
        if (d42Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = d42Var.getChildAt(0);
        b59 b59Var = (b59) d42Var.G(childAt);
        int y = ((((int) childAt.getY()) - gm.m) - gm.L(4.0f)) - gm.L(8.0f);
        if (y > 0 && b59Var != null && b59Var.b() == 0) {
            i = y;
        }
        if (y < 0 || b59Var == null || b59Var.b() != 0) {
            y = i;
        }
        return gm.L(13.0f) + y;
    }

    @Override // a22
    public int getFirstOffset() {
        return gm.L(5.0f) + getListTopPadding();
    }

    @Override // a22
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // a22
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // a22
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.i5));
        int i = cmb.z5;
        d42 d42Var = this.r;
        arrayList.add(new cnb(d42Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(d42Var, 32, new Class[]{bba.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.a7));
        arrayList.add(new cnb(d42Var, 48, new Class[]{bba.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        arrayList.add(new cnb(d42Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
        arrayList.add(new cnb(d42Var, 0, new Class[]{View.class}, cmb.j0, (Drawable[]) null, (bnb) null, cmb.c7));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"nameTextView"}, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"dateTextView"}, (Drawable[]) null, (bnb) null, cmb.z6));
        arrayList.add(new cnb(d42Var, TLObject.FLAG_13, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(d42Var, TLObject.FLAG_14, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(d42Var, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
        arrayList.add(new cnb(d42Var, 40, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.qj));
        arrayList.add(new cnb(d42Var, 4, new Class[]{ida.class}, new String[]{"extTextView"}, (Drawable[]) null, (bnb) null, cmb.rj));
        return arrayList;
    }

    @Override // a22
    public final int j() {
        return 1;
    }

    @Override // a22
    public final boolean k() {
        h42 h42Var = this.w;
        if (h42Var.f.size() <= 0) {
            return false;
        }
        U();
        g42 g42Var = (g42) td4.m(1, h42Var.f);
        this.b.U2.setTitle(g42Var.b);
        int topForScroll = getTopForScroll();
        File file = g42Var.a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        a0();
        this.F.g1(0, topForScroll);
        W(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Z();
    }

    @Override // a22
    public final void p() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.b.U2.o(true);
        r6 t = this.b.U2.t();
        t.removeView(this.H);
        t.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(f42 f42Var) {
        this.R = f42Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.W = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override // a22
    public final void u() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // a22
    public final void w(int i) {
        if (i == 6) {
            gda.I0 = !gda.I0;
            SharedPreferences.Editor edit = oc7.d1().edit();
            edit.putBoolean("sortFilesByName", gda.I0);
            edit.apply();
            this.d0 = gda.I0;
            h42 h42Var = this.w;
            Collections.sort((ArrayList) h42Var.h, new z32(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(h42Var.e, new z32(this, (byte) 0));
            }
            h42Var.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
