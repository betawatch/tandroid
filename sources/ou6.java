// default package

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ou6 extends ep {
    public TextView E;
    public LinearLayout F;
    public Button G;
    public ProgressBar H;
    public ListView I;
    public mu6 J;
    public final ak K;
    public boolean L;
    public long M;
    public final d1 N;
    public final lw6 f;
    public final lu6 h;
    public dw6 n;
    public ArrayList r;
    public TextView s;
    public TextView w;
    public RelativeLayout x;
    public TextView y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ou6(Context context) {
        super(r3, r1 == 0 ? nte.e(r3) : r1);
        byte b = 0;
        ContextThemeWrapper a = nte.a(context, false);
        int g = nte.g(a, R.attr.mediaRouteTheme);
        this.n = dw6.c;
        this.N = new d1(this, (byte) 7);
        this.f = lw6.d(getContext());
        this.h = new lu6(this, b);
        this.K = new ak(this, (byte) 8);
    }

    @Override // ep, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.K);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.M = SystemClock.uptimeMillis();
        this.r.clear();
        this.r.addAll(list);
        this.J.notifyDataSetChanged();
        d1 d1Var = this.N;
        d1Var.removeMessages(3);
        d1Var.removeMessages(2);
        if (!list.isEmpty()) {
            i(1);
        } else {
            i(0);
            d1Var.sendMessageDelayed(d1Var.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.L) {
            this.f.getClass();
            lw6.b();
            ArrayList arrayList = new ArrayList(lw6.c().j);
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                jw6 jw6Var = (jw6) arrayList.get(i);
                if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.n)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, nu6.b);
            if (SystemClock.uptimeMillis() - this.M >= 300) {
                e(arrayList);
                return;
            }
            d1 d1Var = this.N;
            d1Var.removeMessages(1);
            d1Var.sendMessageAtTime(d1Var.obtainMessage(1, arrayList), this.M + 300);
        }
    }

    public final void h(dw6 dw6Var) {
        if (dw6Var == null) {
            lq5.j("selector must not be null");
            return;
        }
        if (this.n.equals(dw6Var)) {
            return;
        }
        this.n = dw6Var;
        if (this.L) {
            lw6 lw6Var = this.f;
            lu6 lu6Var = this.h;
            lw6Var.h(lu6Var);
            lw6Var.a(dw6Var, lu6Var, 1);
        }
        f();
    }

    public final void i(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(0);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(0);
            this.w.setVisibility(8);
            this.H.setVisibility(8);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.I.setVisibility(8);
            this.w.setVisibility(8);
            this.H.setVisibility(0);
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.E.setVisibility(4);
            this.x.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.I.setVisibility(8);
        this.w.setVisibility(8);
        this.H.setVisibility(8);
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.E.setVisibility(0);
        this.x.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        this.f.a(this.n, this.h, 1);
        f();
        d1 d1Var = this.N;
        d1Var.removeMessages(2);
        d1Var.removeMessages(3);
        d1Var.removeMessages(1);
        d1Var.sendMessageDelayed(d1Var.obtainMessage(2), 5000L);
    }

    @Override // ep, rq2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.r = new ArrayList();
        this.J = new mu6(getContext(), this.r);
        this.s = (TextView) findViewById(R.id.mr_chooser_title);
        this.w = (TextView) findViewById(R.id.mr_chooser_searching);
        this.x = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.y = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.E = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.F = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.G = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.H = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        Boolean bool = iie.a;
        boolean z2 = false;
        if (bool == null) {
            if (!iie.c(context)) {
                PackageManager packageManager = context.getPackageManager();
                Boolean bool2 = iie.e;
                if (bool2 == null) {
                    bool2 = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    iie.e = bool2;
                }
                if (!bool2.booleanValue() && !iie.a(context) && !iie.d(context)) {
                    z = true;
                    bool = Boolean.valueOf(z);
                    iie.a = bool;
                }
            }
            z = false;
            bool = Boolean.valueOf(z);
            iie.a = bool;
        }
        if (!bool.booleanValue()) {
            Boolean bool3 = iie.c;
            if (bool3 == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bool3 = Boolean.valueOf(z2);
                iie.c = bool3;
            }
            if (!bool3.booleanValue()) {
                if (iie.c(context) || iie.b(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (iie.d(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    Boolean bool4 = iie.e;
                    if (bool4 == null) {
                        bool4 = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                        iie.e = bool4;
                    }
                    string = bool4.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : iie.a(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.y.setText(string);
                this.E.setMovementMethod(LinkMovementMethod.getInstance());
                this.G.setOnClickListener(new sa5(this, (byte) 26));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.I = listView;
                listView.setAdapter((ListAdapter) this.J);
                this.I.setOnItemClickListener(this.J);
                this.I.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(mte.a(getContext()), -2);
                getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.y.setText(string);
        this.E.setMovementMethod(LinkMovementMethod.getInstance());
        this.G.setOnClickListener(new sa5(this, (byte) 26));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.I = listView2;
        listView2.setAdapter((ListAdapter) this.J);
        this.I.setOnItemClickListener(this.J);
        this.I.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(mte.a(getContext()), -2);
        getContext().registerReceiver(this.K, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.L = false;
        this.f.h(this.h);
        d1 d1Var = this.N;
        d1Var.removeMessages(1);
        d1Var.removeMessages(2);
        d1Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // ep, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.s.setText(charSequence);
    }

    @Override // ep, android.app.Dialog
    public final void setTitle(int i) {
        this.s.setText(i);
    }
}
