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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u32 extends f12 {
    public final t32 E;
    public final q22 F;
    public final s7 G;
    public final s7 H;
    public final rh4 I;
    public AnimatorSet J;
    public final tk4 K;
    public boolean L;
    public final h32 M;
    public float N;
    public boolean O;
    public File P;
    public boolean Q;
    public k32 R;
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
    public final ak f0;
    public ValueAnimator g0;
    public byte n;
    public final i32 r;
    public final i32 s;
    public final m32 w;
    public final m32 x;
    public final td4 y;

    public u32(int i, n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        Cursor cursor;
        final byte b = 0;
        this.Q = false;
        this.S = new HashMap();
        this.T = new ArrayList();
        this.U = new HashMap();
        this.W = -1;
        int i2 = 3;
        this.f0 = new ak(this, (byte) 3);
        m32 m32Var = new m32(this, context);
        this.w = m32Var;
        final byte b2 = 1;
        this.b0 = i == 1;
        byte b3 = 2;
        boolean z = i == 2;
        this.e0 = z;
        this.d0 = xea.I0;
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
                            if (j <= uc7.s1(yac.t0).l4.a1.f() * 1000) {
                                try {
                                    if (j2 <= uc7.s1(yac.t0).l4.Z0.f() && (TextUtils.isEmpty(string) || "audio/mpeg".equals(string) || !"audio/mpeg4".equals(string))) {
                                        n32 n32Var = new n32();
                                        n32Var.b = file.getName();
                                        n32Var.f = file;
                                        String name = file.getName();
                                        String[] split = name.split("\\.");
                                        n32Var.d = split.length > 1 ? split[split.length - 1] : "?";
                                        n32Var.c = hl.i0(file.length(), false, false);
                                        String lowerCase = name.toLowerCase();
                                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                                            n32Var.e = file.getAbsolutePath();
                                        }
                                        ((ArrayList) this.w.h).add(n32Var);
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
                    cc4.g(e, true);
                }
            } else {
                O(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
                Collections.sort((ArrayList) m32Var.h, new e32(this, (byte) 1));
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
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
        s6 u = this.b.U2.u();
        s7 a = u.a(0, R.drawable.outline_header_search);
        a.N();
        a.I = new r10(this, b3);
        this.G = a;
        a.setSearchFieldHint(ob6.M0(2131745564, null));
        a.setContentDescription(ob6.M0(2131745564, null));
        EditTextBoldCursor searchField = a.getSearchField();
        int i3 = aob.j5;
        yob.X(searchField, i3, vnbVar);
        yob.v(searchField, i3, vnbVar);
        yob.D(searchField, aob.Me, vnbVar);
        s7 a2 = u.a(6, this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        this.H = a2;
        a2.setContentDescription(ob6.M0(2131754887, null));
        tk4 tk4Var = new tk4(context, vnbVar);
        this.K = tk4Var;
        addView(tk4Var);
        h32 h32Var = new h32(this, context, tk4Var, vnbVar);
        this.M = h32Var;
        addView(h32Var, tre.c(-1.0f, -1));
        h32Var.setVisibility(8);
        h32Var.setOnTouchListener(new b02((byte) 1));
        i32 i32Var = new i32(this, context, vnbVar, (byte) 0);
        this.s = i32Var;
        i32Var.setSectionsType(2);
        i32Var.setVerticalScrollBarEnabled(false);
        td4 td4Var = new td4(hl.L(56.0f), 0, i32Var);
        this.y = td4Var;
        i32Var.setLayoutManager(td4Var);
        i32Var.setClipToPadding(false);
        m32 m32Var2 = new m32(this, context);
        this.x = m32Var2;
        i32Var.setAdapter(m32Var2);
        addView(i32Var, tre.c(-1.0f, -1));
        i32Var.setVisibility(8);
        i32 i32Var2 = new i32(this, context, vnbVar, (byte) 1);
        this.r = i32Var2;
        i32Var2.s1();
        setBlur3Capture(i32Var2);
        this.d = i32Var2;
        this.h = true;
        this.f = true;
        i32Var2.setSectionsType(2);
        i32Var2.setVerticalScrollBarEnabled(false);
        q22 q22Var = new q22(this, hl.L(56.0f) + hl.m, i32Var2, b2);
        this.F = q22Var;
        i32Var2.setLayoutManager(q22Var);
        i32Var2.setClipToPadding(false);
        i32Var2.setAdapter(this.w);
        addView(i32Var2, tre.c(-1.0f, -1));
        this.E = new t32(this, context);
        i32Var2.setOnScrollListener(new y(this, (byte) 19));
        i32Var2.setOnItemClickListener(new r69(this) { // from class: d32
            public final /* synthetic */ u32 b;

            {
                this.b = this;
            }

            @Override // r69
            public final void e(int i4, View view) {
                byte b4 = b;
                u32 u32Var = this.b;
                switch (b4) {
                    case 0:
                        u32Var.Q(i4, view);
                        break;
                    default:
                        rh4 rh4Var = u32Var.I;
                        rh4Var.K0(true);
                        t32 t32Var = u32Var.E;
                        ArrayList arrayList = rh4Var.f3;
                        ph4 ph4Var = arrayList.isEmpty() ? rh4.k3[i4] : (ph4) arrayList.get(i4);
                        n12 n12Var2 = t32Var.Y.b;
                        ArrayList arrayList2 = t32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (ph4Var.b((ph4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(ph4Var);
                        n12Var2.U2.setSearchFilter(ph4Var);
                        n12Var2.U2.setSearchFieldText("");
                        t32Var.a0(null, null, true);
                        break;
                }
            }
        });
        i32Var2.setOnItemLongClickListener(new rd1((Object) this, (byte) 16));
        rh4 rh4Var = new rh4(context, vnbVar);
        this.I = rh4Var;
        rh4Var.setOnItemClickListener(new r69(this) { // from class: d32
            public final /* synthetic */ u32 b;

            {
                this.b = this;
            }

            @Override // r69
            public final void e(int i4, View view) {
                byte b4 = b2;
                u32 u32Var = this.b;
                switch (b4) {
                    case 0:
                        u32Var.Q(i4, view);
                        break;
                    default:
                        rh4 rh4Var2 = u32Var.I;
                        rh4Var2.K0(true);
                        t32 t32Var = u32Var.E;
                        ArrayList arrayList = rh4Var2.f3;
                        ph4 ph4Var = arrayList.isEmpty() ? rh4.k3[i4] : (ph4) arrayList.get(i4);
                        n12 n12Var2 = t32Var.Y.b;
                        ArrayList arrayList2 = t32Var.S;
                        if (!arrayList2.isEmpty()) {
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                if (ph4Var.b((ph4) arrayList2.get(i5))) {
                                    break;
                                }
                            }
                        }
                        arrayList2.add(ph4Var);
                        n12Var2.U2.setSearchFilter(ph4Var);
                        n12Var2.U2.setSearchFieldText("");
                        t32Var.a0(null, null, true);
                        break;
                }
            }
        });
        yob.h(aob.h5, vnbVar, rh4Var);
        addView(rh4Var, tre.e(-1, 44, 48));
        rh4Var.setTranslationY(-hl.L(44.0f));
        rh4Var.setVisibility(4);
        S();
        Z();
        X();
    }

    private int getTopForScroll() {
        i32 i32Var = this.r;
        View childAt = i32Var.getChildAt(0);
        f89 H = i32Var.H(childAt);
        int i = -i32Var.getPaddingTop();
        return (H == null || H.b() != 0) ? i : childAt.getTop() + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    @Override // f12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, int i2) {
        int L;
        int i3;
        n12 n12Var = this.b;
        if (n12Var.U2.o0 || n12Var.o3.Q() > hl.L(20.0f)) {
            L = hl.L(56.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    L = i3 - hl.L(1.0f);
                    if (L < 0) {
                        L = 0;
                    }
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            L = i3 - hl.L(1.0f);
            if (L < 0) {
            }
            n12Var.r0 = true;
        }
        this.r.r1(0, L + hl.m, 0, this.e);
        ((FrameLayout.LayoutParams) this.I.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.a.getCurrentActionBarHeight();
    }

    @Override // f12
    public final void D() {
        m32 m32Var = this.w;
        if (m32Var != null) {
            m32Var.f();
        }
        t32 t32Var = this.E;
        if (t32Var != null) {
            t32Var.f();
        }
    }

    @Override // f12
    public final void H(f12 f12Var) {
        this.S.clear();
        this.U.clear();
        this.E.S.clear();
        this.T.clear();
        this.w.f.clear();
        S();
        Z();
        X();
        this.b.U2.setTitle(ob6.M0(2131745385, null));
        this.H.setVisibility(0);
        this.F.g1(0, 0);
    }

    @Override // f12
    public final void J() {
        this.r.A0(0);
    }

    @Override // f12
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        int size = this.S.size();
        HashMap hashMap = this.U;
        if ((size == 0 && hashMap.size() == 0) || this.R == null || this.L) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((r47) hashMap.get((qg4) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(this.T);
        n12 n12Var = this.b;
        CharSequence[] charSequenceArr = {n12Var.V0().getText()};
        final ArrayList Y = ls6.d0(n12Var.G3).Y(charSequenceArr, true, true);
        final String charSequence = charSequenceArr[0].toString();
        return jj.Y(n12Var.G3, n12Var.W0(), n12Var.S0() + arrayList2.size() + (!TextUtils.isEmpty(charSequence) ? 1 : 0), new pcc() { // from class: c32
            @Override // pcc
            public final void a(Object obj) {
                u32 u32Var = u32.this;
                u32Var.L = true;
                u32Var.R.k(arrayList2, charSequence, Y, arrayList, z, i, j, z2, ((Long) obj).longValue());
                u32Var.b.a(true);
            }
        }, 0L);
    }

    public final void O(File file) {
        File[] listFiles = file.listFiles();
        File j = xb4.j(6);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory() && file2.getName().equals("Telegram")) {
                    O(file2);
                } else if (!file2.equals(j)) {
                    n32 n32Var = new n32();
                    n32Var.b = file2.getName();
                    n32Var.f = file2;
                    String name = file2.getName();
                    String[] split = name.split("\\.");
                    n32Var.d = split.length > 1 ? split[split.length - 1] : "?";
                    n32Var.c = hl.i0(file2.length(), false, false);
                    String lowerCase = name.toLowerCase();
                    if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                        n32Var.e = file2.getAbsolutePath();
                    }
                    ((ArrayList) this.w.h).add(n32Var);
                }
            }
        }
    }

    public final boolean P(File file) {
        int i;
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(xb4.D(file));
        if (file.length() == 0 || mimeTypeFromExtension == null || !wm9.i.contains(mimeTypeFromExtension)) {
            new d31(this.b.c, null).u(ob6.a0("InvalidFormatError", null, 2131748935, new Object[0]), ob6.M0(2131751068, null), null).j();
            return false;
        }
        if (file.length() > uc7.s1(yac.t0).l4.Z0.f()) {
            new d31(this.b.c, null).u(ob6.a0("TooLargeError", null, 2131743696, new Object[0]), ob6.a0("ErrorRingtoneSizeTooBig", null, 2131751067, Integer.valueOf(uc7.s1(yac.t0).l4.Z0.f() / 1024)), null).j();
            return false;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(a.b, Uri.fromFile(file));
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception unused) {
            i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i <= uc7.s1(yac.t0).l4.a1.f() * 1000) {
            return true;
        }
        new d31(this.b.c, null).u(ob6.a0("TooLongError", null, 2131743695, new Object[0]), ob6.a0("ErrorRingtoneDurationTooLong", null, 2131751069, Integer.valueOf(uc7.s1(yac.t0).l4.a1.f())), null).j();
        return false;
    }

    public final void Q(int i, View view) {
        Object O;
        int i2;
        i32 i32Var = this.r;
        j79 adapter = i32Var.getAdapter();
        m32 m32Var = this.w;
        if (adapter == m32Var) {
            O = m32Var.E(i);
        } else {
            t32 t32Var = this.E;
            O = t32Var.O(t32Var.S(i), t32Var.Q(i));
        }
        if (!(O instanceof n32)) {
            T(view, O);
            return;
        }
        n32 n32Var = (n32) O;
        File file = n32Var.f;
        boolean isExternalStorageManager = Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : false;
        boolean z = f11.b;
        n12 n12Var = this.b;
        if (!z && (((i2 = n32Var.a) == R.drawable.files_storage || i2 == R.drawable.files_internal) && !isExternalStorageManager)) {
            a12 a12Var = n12Var.o3;
            int i3 = n12Var.G3;
            if (n12Var.E3 == null || n12Var.E1 - n12Var.F1 >= 0) {
                this.R.z();
                return;
            } else if (uc7.s1(i3).M3() || uc7.s1(i3).l4.p1.f() <= n12Var.F1) {
                new d31(a12Var, n12Var.J0).t(ob6.M0(2131743695, null), n12Var.J0).j();
                return;
            } else {
                new d31(a12Var, n12Var.J0).f(uc7.s1(i3).l4.p1.f(), new vq0(n12Var, (byte) 5)).j();
                return;
            }
        }
        if (file != null) {
            if (!file.isDirectory()) {
                T(view, n32Var);
                return;
            }
            l32 l32Var = new l32();
            View childAt = i32Var.getChildAt(0);
            f89 H = i32Var.H(childAt);
            if (H != null) {
                H.b();
                childAt.getTop();
                l32Var.a = this.P;
                l32Var.b = n12Var.U2.getTitle();
                U();
                m32Var.f.add(l32Var);
                if (!R(file)) {
                    m32Var.f.remove(l32Var);
                    return;
                } else {
                    V(1);
                    n12Var.U2.setTitle(n32Var.b);
                    return;
                }
            }
            return;
        }
        int i4 = n32Var.a;
        if (i4 == R.drawable.files_gallery) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            e eVar = n12Var.Z1;
            zu1 zu1Var = eVar instanceof zu1 ? (zu1) eVar : null;
            l98 l98Var = new l98(0, MediaController.a2, hashMap, arrayList, 0, zu1Var != null, zu1Var, false);
            l98Var.m0 = true;
            l98Var.t0 = new rx6(this, hashMap, arrayList);
            l98Var.j0(this.W, false);
            e eVar2 = n12Var.Z1;
            if (eVar2 != null) {
                eVar2.presentFragment(l98Var);
            } else {
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.presentFragment(l98Var);
                }
            }
            n12Var.a(true);
            return;
        }
        if (i4 == R.drawable.files_music) {
            k32 k32Var = this.R;
            if (k32Var != null) {
                k32Var.S();
                return;
            }
            return;
        }
        int topForScroll = getTopForScroll();
        U();
        l32 l32Var2 = (l32) qd4.l(1, m32Var.f);
        n12Var.U2.setTitle(l32Var2.b);
        File file2 = l32Var2.a;
        if (file2 != null) {
            R(file2);
        } else {
            S();
        }
        Z();
        this.F.g1(0, topForScroll);
        V(2);
    }

    public final boolean R(File file) {
        File file2;
        m32 m32Var;
        this.O = false;
        boolean canRead = file.canRead();
        i32 i32Var = this.r;
        String str = null;
        m32 m32Var2 = this.w;
        if (!canRead) {
            if ((!file.getAbsolutePath().startsWith(Environment.getExternalStorageDirectory().toString()) && !file.getAbsolutePath().startsWith("/sdcard") && !file.getAbsolutePath().startsWith("/mnt/sdcard")) || Environment.getExternalStorageState().equals("mounted") || Environment.getExternalStorageState().equals("mounted_ro")) {
                W(ob6.M0(2131754706, null));
                return false;
            }
            this.P = file;
            m32Var2.e.clear();
            Environment.getExternalStorageState();
            hl.y(i32Var);
            this.V = true;
            m32Var2.f();
            return true;
        }
        try {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                W(ob6.M0(2131743534, null));
                return false;
            }
            this.P = file;
            ArrayList arrayList = m32Var2.e;
            ArrayList arrayList2 = m32Var2.f;
            ArrayList arrayList3 = m32Var2.e;
            arrayList.clear();
            File j = xb4.j(6);
            int i = 0;
            while (i < listFiles.length) {
                File file3 = listFiles[i];
                if (file3.getName().indexOf(46) == 0 || file3.equals(j)) {
                    m32Var = m32Var2;
                } else {
                    n32 n32Var = new n32();
                    n32Var.b = file3.getName();
                    n32Var.f = file3;
                    if (file3.isDirectory()) {
                        n32Var.a = R.drawable.files_folder;
                        n32Var.c = ob6.M0(2131750645, str);
                        m32Var = m32Var2;
                    } else {
                        this.O = true;
                        String name = file3.getName();
                        String[] split = name.split("\\.");
                        n32Var.d = split.length > 1 ? split[split.length - 1] : "?";
                        m32Var = m32Var2;
                        n32Var.c = hl.i0(file3.length(), false, false);
                        String lowerCase = name.toLowerCase();
                        if (lowerCase.endsWith(".jpg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif") || lowerCase.endsWith(".jpeg")) {
                            n32Var.e = file3.getAbsolutePath();
                        }
                    }
                    arrayList3.add(n32Var);
                }
                i++;
                m32Var2 = m32Var;
                str = null;
            }
            m32 m32Var3 = m32Var2;
            n32 n32Var2 = new n32();
            n32Var2.b = "..";
            if (arrayList2.size() > 0) {
                File file4 = ((l32) c00.g(1, arrayList2)).a;
                file2 = null;
                if (file4 == null) {
                    n32Var2.c = ob6.M0(2131750645, null);
                } else {
                    n32Var2.c = file4.toString();
                }
            } else {
                file2 = null;
                n32Var2.c = ob6.M0(2131750645, null);
            }
            n32Var2.a = R.drawable.files_folder;
            n32Var2.f = file2;
            arrayList3.add(0, n32Var2);
            if (this.P != null) {
                Collections.sort(m32Var3.e, new e32(this, (byte) 0));
            }
            Z();
            hl.y(i32Var);
            this.V = true;
            int topForScroll = getTopForScroll();
            m32Var3.f();
            this.F.g1(0, topForScroll);
            return true;
        } catch (Exception e) {
            W(e.getLocalizedMessage());
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
        n12 n12Var;
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
            n32 n32Var = new n32();
            if (Environment.isExternalStorageRemovable()) {
                n32Var.b = ob6.M0(2131745568, null);
                n32Var.a = R.drawable.files_internal;
                n32Var.c = ob6.M0(2131750821, null);
            } else {
                n32Var.b = ob6.M0(2131748942, null);
                n32Var.a = R.drawable.files_storage;
                n32Var.c = ob6.M0(2131748944, null);
            }
            n32Var.f = Environment.getExternalStorageDirectory();
            this.w.e.add(n32Var);
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
                            if (f11.a) {
                                cc4.b(readLine);
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
                                    n32 n32Var2 = new n32();
                                    if (nextToken.toLowerCase().contains("sd")) {
                                        n32Var2.b = ob6.M0(2131745568, null);
                                    } else {
                                        n32Var2.b = ob6.M0(2131750820, null);
                                    }
                                    n32Var2.c = ob6.M0(2131750821, null);
                                    n32Var2.a = R.drawable.files_internal;
                                    n32Var2.f = new File(nextToken);
                                    this.w.e.add(n32Var2);
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    cc4.g(e, true);
                }
                try {
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e5) {
                        cc4.g(e5, true);
                    }
                }
                throw th;
            }
        }
        bufferedReader.close();
        try {
            File file = new File(a.b.getExternalFilesDir(null), "Telegram");
            if (file.exists()) {
                n32 n32Var3 = new n32();
                n32Var3.b = "Telegram";
                n32Var3.c = ob6.M0(2131754234, null);
                n32Var3.a = R.drawable.files_folder;
                n32Var3.f = file;
                this.w.e.add(n32Var3);
            }
        } catch (Exception e6) {
            cc4.g(e6, true);
        }
        if (!this.e0 && ((n12Var = this.b) == null || !n12Var.B1)) {
            n32 n32Var4 = new n32();
            n32Var4.b = ob6.M0(2131750445, null);
            n32Var4.c = ob6.M0(2131750438, null);
            n32Var4.a = R.drawable.files_gallery;
            n32Var4.f = null;
            this.w.e.add(n32Var4);
        }
        if (this.b0) {
            n32 n32Var5 = new n32();
            n32Var5.b = ob6.M0(2131753945, null);
            n32Var5.c = ob6.M0(2131748069, null);
            n32Var5.a = R.drawable.files_music;
            n32Var5.f = null;
            this.w.e.add(n32Var5);
        }
        if (!((ArrayList) this.w.h).isEmpty()) {
            this.O = true;
        }
        hl.y(this.r);
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
        boolean z2 = obj instanceof n32;
        ArrayList arrayList = this.T;
        n12 n12Var = this.b;
        HashMap hashMap = this.S;
        HashMap hashMap2 = this.U;
        boolean z3 = false;
        if (!z2) {
            if (obj instanceof r47) {
                r47 r47Var = (r47) obj;
                qg4 qg4Var = new qg4(r47Var.e1(), r47.B0(r47Var.k));
                if (hashMap2.containsKey(qg4Var)) {
                    hashMap2.remove(qg4Var);
                } else if (hashMap2.size() < 100) {
                    hashMap2.put(qg4Var, r47Var);
                    z3 = true;
                }
                z = z3;
                if (n12Var.B1) {
                }
            }
            return false;
        }
        n32 n32Var = (n32) obj;
        File file = n32Var.f;
        if (file != null && !file.isDirectory()) {
            String absolutePath = n32Var.f.getAbsolutePath();
            if (hashMap.containsKey(absolutePath)) {
                hashMap.remove(absolutePath);
                arrayList.remove(absolutePath);
                z = false;
            } else {
                if (!n32Var.f.canRead()) {
                    W(ob6.M0(2131754706, null));
                    return false;
                }
                if (this.a0 && n32Var.e == null) {
                    W(ob6.a0("PassportUploadNotImage", null, 2131747177, new Object[0]));
                    return false;
                }
                if ((n32Var.f.length() > 2097152000 && !yac.h(yac.t0).p()) || n32Var.f.length() > 4194304000L) {
                    l46 l46Var = new l46(6, yac.t0, null, n12Var.c.getContext(), n12Var.Z1);
                    l46Var.I2 = true;
                    l46Var.x1();
                    l46Var.show();
                    return false;
                }
                if (this.W >= 0) {
                    int size = hashMap.size();
                    int i = this.W;
                    if (size >= i) {
                        W(ob6.a0("PassportUploadMaxReached", null, 2131747178, ob6.G(i, "Files", new Object[0])));
                        return false;
                    }
                }
                if ((!this.e0 || P(n32Var.f)) && n32Var.f.length() != 0) {
                    boolean z4 = n12Var.Q2;
                    hashMap.put(absolutePath, n32Var);
                    arrayList.add(absolutePath);
                    z = true;
                }
            }
            this.V = false;
            if (n12Var.B1) {
                if (view instanceof zea) {
                    ((zea) view).b(z, true);
                }
                n12Var.G1(z ? 1 : 2);
                return true;
            }
            if ((!hashMap.isEmpty() || !hashMap2.isEmpty()) && this.R != null && !this.L) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = hashMap2.keySet().iterator();
                while (it.hasNext()) {
                    arrayList2.add((r47) hashMap2.get((qg4) it.next()));
                }
                this.R.k(new ArrayList(arrayList), null, null, arrayList2, false, 0, 0L, false, 0L);
            }
            return true;
        }
        return false;
    }

    public final void U() {
        View m;
        m32 m32Var = this.x;
        m32Var.f.clear();
        ArrayList arrayList = m32Var.f;
        m32 m32Var2 = this.w;
        arrayList.addAll(m32Var2.f);
        ArrayList arrayList2 = m32Var.e;
        arrayList2.clear();
        arrayList2.addAll(m32Var2.e);
        ArrayList arrayList3 = (ArrayList) m32Var.h;
        arrayList3.clear();
        arrayList3.addAll((ArrayList) m32Var2.h);
        m32Var.f();
        i32 i32Var = this.s;
        i32Var.setVisibility(0);
        i32 i32Var2 = this.r;
        i32Var.setPadding(i32Var2.getPaddingLeft(), i32Var2.getPaddingTop(), i32Var2.getPaddingRight(), i32Var2.getPaddingBottom());
        q22 q22Var = this.F;
        int K0 = q22Var.K0();
        if (K0 < 0 || (m = q22Var.m(K0)) == null) {
            return;
        }
        this.y.g1(K0, m.getTop() - i32Var.getPaddingTop());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(final int i) {
        i32 i32Var;
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
            i32Var = this.r;
            if (i2 >= childCount) {
                i2 = 0;
                break;
            } else if (getChildAt(i2) == i32Var) {
                break;
            } else {
                i2++;
            }
        }
        i32 i32Var2 = this.s;
        if (i == 1) {
            L = hl.L(150.0f);
            i32Var2.setAlpha(1.0f);
            i32Var2.setScaleX(1.0f);
            i32Var2.setScaleY(1.0f);
            i32Var2.setTranslationX(0.0f);
            removeView(i32Var2);
            addView(i32Var2, i2);
            i32Var2.setVisibility(0);
            i32Var.setTranslationX(L);
            i32Var.setAlpha(0.0f);
            ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.g0 = ofFloat;
        } else {
            L = hl.L(150.0f);
            i32Var.setAlpha(0.0f);
            i32Var.setScaleX(0.95f);
            i32Var.setScaleY(0.95f);
            i32Var2.setScaleX(1.0f);
            i32Var2.setScaleY(1.0f);
            i32Var2.setTranslationX(0.0f);
            i32Var2.setAlpha(1.0f);
            removeView(i32Var2);
            addView(i32Var2, i2 + 1);
            i32Var2.setVisibility(0);
            ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g0 = ofFloat;
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: f32
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u32 u32Var = u32.this;
                i32 i32Var3 = u32Var.r;
                i32 i32Var4 = u32Var.s;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                byte b = i;
                float f = L * floatValue;
                if (b == 1) {
                    i32Var3.setTranslationX(f);
                    i32Var3.setAlpha(1.0f - floatValue);
                    i32Var3.invalidate();
                    i32Var4.setAlpha(floatValue);
                    float f2 = (floatValue * 0.05f) + 0.95f;
                    i32Var4.setScaleX(f2);
                    i32Var4.setScaleY(f2);
                    return;
                }
                i32Var4.setTranslationX(f);
                i32Var4.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                i32Var4.invalidate();
                i32Var3.setAlpha(floatValue);
                float f3 = (floatValue * 0.05f) + 0.95f;
                i32Var3.setScaleX(f3);
                i32Var3.setScaleY(f3);
                i32Var4.invalidate();
            }
        });
        this.g0.addListener(new jb1((Object) this, (byte) 15));
        ValueAnimator valueAnimator2 = this.g0;
        if (i == 1) {
            valueAnimator2.setDuration(220L);
        } else {
            valueAnimator2.setDuration(200L);
        }
        this.g0.setInterpolator(k43.f);
        this.g0.start();
    }

    public final void W(String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
        String M0 = ob6.M0(R.string.AppName, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = str;
        c00.u(null, 2131747558, alertDialog$Builder, null);
    }

    public final void X() {
        j79 adapter = this.r.getAdapter();
        boolean z = true;
        t32 t32Var = this.E;
        if (adapter != t32Var ? this.w.b() != 1 : !(t32Var.s.isEmpty() && t32Var.Q.isEmpty())) {
            z = false;
        }
        this.M.setVisibility(z ? 0 : 8);
        Y();
    }

    public final void Y() {
        View childAt;
        h32 h32Var = this.M;
        if (h32Var.getVisibility() != 0 || (childAt = this.r.getChildAt(0)) == null) {
            return;
        }
        float translationY = h32Var.getTranslationY();
        this.N = (childAt.getTop() + (h32Var.getMeasuredHeight() - getMeasuredHeight())) / 2;
        h32Var.setTranslationY(translationY);
    }

    public final void Z() {
        s7 s7Var = this.G;
        if (s7Var == null || s7Var.w()) {
            return;
        }
        s7Var.setVisibility((this.O || this.w.f.isEmpty()) ? 0 : 8);
    }

    @Override // f12
    public final void d() {
        s7 s7Var = this.G;
        if (s7Var != null) {
            try {
                if (s7Var.getSearchField() != null) {
                    s7Var.getSearchField().setCursorColor(aob.v0(aob.j5, this.a));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override // f12
    public int getButtonsHideOffset() {
        return hl.L(62.0f);
    }

    @Override // f12
    public int getCurrentItemTop() {
        i32 i32Var = this.r;
        if (i32Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i = 0;
        View childAt = i32Var.getChildAt(0);
        n69 n69Var = (n69) i32Var.H(childAt);
        int y = ((((int) childAt.getY()) - hl.m) - hl.L(4.0f)) - hl.L(8.0f);
        if (y > 0 && n69Var != null && n69Var.b() == 0) {
            i = y;
        }
        if (y < 0 || n69Var == null || n69Var.b() != 0) {
            y = i;
        }
        return hl.L(13.0f) + y;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(5.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // f12
    public int getSelectedItemsCount() {
        return this.U.size() + this.S.size();
    }

    @Override // f12
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.G.getSearchField(), 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.j5));
        int i = aob.A5;
        i32 i32Var = this.r;
        arrayList.add(new apb(i32Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(i32Var, 32, new Class[]{sca.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.b7));
        arrayList.add(new apb(i32Var, 48, new Class[]{sca.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        arrayList.add(new apb(i32Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
        arrayList.add(new apb(i32Var, 0, new Class[]{View.class}, aob.j0, (Drawable[]) null, (zob) null, aob.d7));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"nameTextView"}, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"dateTextView"}, (Drawable[]) null, (zob) null, aob.A6));
        arrayList.add(new apb(i32Var, TLObject.FLAG_13, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(i32Var, TLObject.FLAG_14, new Class[]{zea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(i32Var, 8, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.qj));
        arrayList.add(new apb(i32Var, 40, new Class[]{zea.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (zob) null, aob.rj));
        arrayList.add(new apb(i32Var, 4, new Class[]{zea.class}, new String[]{"extTextView"}, (Drawable[]) null, (zob) null, aob.sj));
        return arrayList;
    }

    @Override // f12
    public final int j() {
        return 1;
    }

    @Override // f12
    public final boolean k() {
        m32 m32Var = this.w;
        if (m32Var.f.size() <= 0) {
            return false;
        }
        U();
        l32 l32Var = (l32) qd4.l(1, m32Var.f);
        this.b.U2.setTitle(l32Var.b);
        int topForScroll = getTopForScroll();
        File file = l32Var.a;
        if (file != null) {
            R(file);
        } else {
            S();
        }
        Z();
        this.F.g1(0, topForScroll);
        V(2);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Y();
    }

    @Override // f12
    public final void p() {
        try {
            if (this.Q) {
                a.b.unregisterReceiver(this.f0);
                this.Q = false;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.b.U2.o(true);
        s6 u = this.b.U2.u();
        u.removeView(this.H);
        u.removeView(this.G);
    }

    public void setCanSelectOnlyImageFiles(boolean z) {
        this.a0 = z;
    }

    public void setDelegate(k32 k32Var) {
        this.R = k32Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.W = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    @Override // f12
    public final void v() {
        this.H.setVisibility(8);
        this.G.setVisibility(8);
    }

    @Override // f12
    public final void x(int i) {
        if (i == 6) {
            xea.I0 = !xea.I0;
            SharedPreferences.Editor edit = uc7.e1().edit();
            edit.putBoolean("sortFilesByName", xea.I0);
            edit.apply();
            this.d0 = xea.I0;
            m32 m32Var = this.w;
            Collections.sort((ArrayList) m32Var.h, new e32(this, (byte) 1));
            if (this.P != null) {
                Collections.sort(m32Var.e, new e32(this, (byte) 0));
            }
            m32Var.f();
            this.H.setIcon(this.d0 ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
        }
    }
}
