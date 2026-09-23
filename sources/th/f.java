package th;

import ai.n8;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.o;
import ci.h2;
import ci.i2;
import ii.q1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k2.u;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.z10;
import org.telegram.ui.u5;
import r0.a0;
import s4.j;
import tg.v0;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f extends bb implements le.e {
    public static final /* synthetic */ int r0 = 0;
    public final le.f X;
    public final le.c Y;
    public final HashMap Z;
    public final ArrayList a0;
    public final ArrayList b0;
    public String c0;
    public v51 d0;
    public final ci.d e0;
    public final o f0;
    public final u5 g0;
    public final g20 h0;
    public final v3 i0;
    public final HashMap j0;
    public u k0;
    public int l0;
    public final int m0;
    public final FrameLayout n0;
    public HashSet o0;
    public final Rect p0;
    public n30 q0;

    public f(Context context, d6 d6Var) {
        super(context, d6Var, true);
        rr rrVar = rr.h;
        this.X = new le.f(3, this, rrVar, 350L);
        this.Y = new le.c(4, this, rrVar, 320L, false);
        this.Z = new HashMap();
        this.a0 = new ArrayList();
        this.b0 = new ArrayList();
        this.j0 = new HashMap();
        this.p0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.L = false;
        this.w = false;
        this.m0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new kg0(this, 13));
        this.d.setOnItemClickListener(new c(context, d6Var, this));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.e0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        o oVar = new o(this, context);
        this.f0 = oVar;
        oVar.setTextColor(getThemedColor(h6.Sh));
        oVar.setText(LocaleController.getString(R.string.Save));
        oVar.setTypeface(AndroidUtilities.bold());
        oVar.setTextSize(1, 14.0f);
        oVar.setGravity(17);
        oVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        oVar.setVisibility(8);
        z5.a(oVar);
        this.e.n().addView(oVar, x5.t(-2, 48, 16, 12, 0, 12, 0));
        oVar.setOnClickListener(new a(this, 1));
        c20 c20Var = new c20(context, d6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        h2 h2Var = c20Var.r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new i2(this, 17));
        g20 g20Var = new g20(context, this.currentAccount);
        this.h0 = g20Var;
        g20Var.setDelegate(new b(this));
        u5 u5Var = new u5(context, d6Var, this);
        this.g0 = u5Var;
        int i11 = this.backgroundPaddingLeft;
        u5Var.setPadding(i11, 0, i11, 0);
        u5Var.addView(c20Var, x5.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        u5Var.addView(g20Var, x5.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        v3 v3Var = new v3(context, 18, d6Var);
        this.i0 = v3Var;
        v3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        v3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        u5Var.addView(v3Var, x5.e(-1, 32, 48));
        this.containerView.addView(u5Var, x5.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, x5.c(48.0f, -1));
        this.containerView.addView(frameLayout, x5.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, x5.e(-1, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 80));
        j jVar = new j();
        jVar.n(350L);
        jVar.o(rrVar);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        this.d.i(new d(this, d6Var));
        q1 q1Var = new q1(this, 15);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new n8(q1Var, 20));
        a0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.j0;
        HashMap hashMap2 = fVar.Z;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.a0;
        arrayList.addAll((Collection) pair.second);
        Map.-EL.forEach(hashMap2, new v0(fVar, 1));
        HashSet hashSet = fVar.o0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        r7 = null;
                        break;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                        if (TextUtils.equals(str, tL_help_country.iso2)) {
                            break;
                        }
                    }
                }
                if (tL_help_country != null) {
                    n30 n30Var = new n30(fVar.getContext(), tL_help_country);
                    n30Var.setOnClickListener(new a(fVar, 3));
                    fVar.h0.a(n30Var);
                    hashMap.put(tL_help_country.iso2, n30Var);
                }
            }
        }
        fVar.d0.N(true);
        fVar.e0.b(hashMap.size(), true);
    }

    @Override // le.e
    public final void D(int i10, float f7, float f10, le.f fVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                z10.d(this.f0, f7);
            }
        } else {
            Q();
            this.i0.setTranslationY(AndroidUtilities.dp(48.0f) + f7);
            this.g0.invalidate();
        }
    }

    public final void Q() {
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.X.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.p0;
        boolean z10 = (rect.top == dp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        ml0 ml0Var = this.d;
        ml0Var.setClipBounds(rect);
        if (z10) {
            ml0Var.invalidate();
        }
    }

    public final void R() {
        ml0 ml0Var;
        float f7 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            ml0Var = this.d;
            if (i10 >= ml0Var.getChildCount()) {
                break;
            }
            View childAt = ml0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7 + AndroidUtilities.dp(8.0f));
        u5 u5Var = this.g0;
        if (u5Var.getTranslationY() != max) {
            u5Var.setTranslationY(max);
            ml0Var.invalidate();
        }
    }

    public final void S(View view) {
        n30 n30Var = (n30) view;
        if (!n30Var.y) {
            n30 n30Var2 = this.q0;
            if (n30Var2 != null) {
                n30Var2.a();
            }
            this.q0 = n30Var;
            n30Var.b();
            return;
        }
        this.q0 = null;
        this.h0.c(n30Var);
        String countryIso2 = n30Var.getCountryIso2();
        HashMap hashMap = this.j0;
        hashMap.remove(countryIso2);
        this.e0.b(hashMap.size(), true);
        this.d0.N(true);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override // org.telegram.ui.Components.bb
    public final ll0 v(ml0 ml0Var) {
        v51 v51Var = new v51(ml0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 8), this.resourcesProvider);
        this.d0 = v51Var;
        v51Var.r = false;
        return v51Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override // le.e
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
