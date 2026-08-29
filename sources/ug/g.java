package ug;

import android.content.Context;
import android.widget.FrameLayout;
import i7.f6;
import i7.h6;
import ie.i;
import jh.y0;
import l3.g0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout implements vd.b {
    public static final int[] s;
    public final String[] a;
    public final c6 b;
    public final og.a c;
    public final lg.a d;
    public final g0[] e;
    public final i[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public g(Context context, c6 c6Var, og.b bVar, lg.a aVar) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new g0[7];
        this.f = new i[7];
        this.r = 83;
        this.d = aVar;
        this.c = bVar;
        this.b = c6Var;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            g0[] g0VarArr = this.e;
            if (i11 >= g0VarArr.length || g0VarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    public final void a() {
        int i10 = 0;
        float f9 = 0.0f;
        while (true) {
            g0[] g0VarArr = this.e;
            if (i10 >= g0VarArr.length) {
                return;
            }
            g0 g0Var = g0VarArr[i10];
            if (g0Var != null) {
                tg.b bVar = (tg.b) g0Var.b;
                float f10 = ((vd.a) g0Var.c).e;
                float f11 = ((vd.a) g0Var.d).e;
                bVar.setVisibility(f10 > 0.0f ? 0 : 8);
                bVar.setAlpha(f10);
                bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f10));
                if (i10 != 0) {
                    bVar.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(80.0f)) - f9);
                }
                f9 += (AndroidUtilities.dp((f11 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f10;
            }
            i10++;
        }
    }

    public final i b(int i10) {
        i[] iVarArr = this.f;
        if (iVarArr[i10] == null) {
            i iVar = new i();
            iVar.a = 0;
            iVar.b = false;
            iVar.c = true;
            iVarArr[i10] = iVar;
        }
        return iVarArr[i10];
    }

    public final void c(int i10, int i11, boolean z10) {
        b(i10).a = i11;
        g0 g0Var = this.e[i10];
        if (g0Var != null) {
            ((tg.b) g0Var.b).a(i11, z10);
            ((vd.a) g0Var.d).a(i11 > 0, z10);
        }
    }

    public final void d(boolean z10) {
        b(1).b = z10;
        g0 g0Var = this.e[1];
        if (g0Var != null) {
            ((tg.b) g0Var.b).c(z10, true);
        }
    }

    public final void e(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        g0[] g0VarArr = this.e;
        g0 g0Var = g0VarArr[i10];
        if (g0Var != null || z10) {
            if (g0Var == null) {
                int i13 = i10 << 16;
                vd.a aVar = new vd.a(i13 | 1, this, i10 == 0 ? jr.h : ud.a.a, i10 == 0 ? 300L : 280L, false);
                vd.a aVar2 = new vd.a(i13 | 2, this, i10 == 0 ? jr.h : ud.a.a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                Context context = getContext();
                int i14 = s[i10];
                c6 c6Var = this.b;
                tg.b bVar = new tg.b(context, c6Var);
                tg.a d = tg.a.d(context, this.d, this.c, c6Var, i14, i12);
                bVar.b = d;
                bVar.addView(d, f6.e(i11, i11, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                h6.b(bVar, 0.13f, 2.0f);
                float f9 = i11 / 2.0f;
                bVar.setPivotX(AndroidUtilities.dp(f9));
                bVar.setPivotY(AndroidUtilities.dp(f9 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i10]);
                bVar.setOnClickListener(new y0(this, i10, 27));
                bVar.setOnLongClickListener(new gm0(this, i10, 1));
                if (i10 == 6) {
                    tg.a aVar3 = bVar.b;
                    aVar3.h = -1.0f;
                    aVar3.a();
                }
                if (i10 == 1) {
                    bVar.d = true;
                    qq qqVar = bVar.c;
                    if (qqVar != null) {
                        qqVar.setReverse(true);
                    }
                }
                addView(bVar, f6.e(i11, i11 + 8, this.r));
                g0VarArr[i10] = new g0(bVar, aVar, aVar2, false, 29);
                i iVar = this.f[i10];
                if (iVar != null) {
                    bVar.a(iVar.a, false);
                    aVar.a(false, false);
                    aVar2.a(iVar.a > 0, false);
                    bVar.c(iVar.b, false);
                    bVar.b(iVar.c, false);
                }
                a();
            }
            ((vd.a) g0VarArr[i10].c).a(z10, z11);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public void setGravity(int i10) {
        this.r = i10;
    }

    public void setOnClickListener(a aVar) {
        this.h = aVar;
    }

    public void setOnLongClickListener(b bVar) {
        this.n = bVar;
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
