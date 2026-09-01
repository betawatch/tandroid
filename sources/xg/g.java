package xg;

import android.content.Context;
import android.widget.FrameLayout;
import k7.c6;
import k7.e6;
import ke.i;
import mh.x0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.wq;
import s5.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g extends FrameLayout implements xd.b {
    public static final int[] s;
    public final String[] a;
    public final g6 b;
    public final rg.a c;
    public final og.a d;
    public final m[] e;
    public final i[] f;
    public a h;
    public b n;
    public int r;

    static {
        int i10 = R.drawable.msg_input_attach2;
        int i11 = R.drawable.pagedown;
        s = new int[]{i10, i11, R.drawable.mentionbutton, R.drawable.reactionbutton, R.drawable.menu_poll_notify, i11, i11};
    }

    public g(Context context, g6 g6Var, rg.b bVar, og.a aVar) {
        super(context);
        this.a = new String[]{LocaleController.getString(R.string.AttachMenu), LocaleController.getString(R.string.AccDescrPageDown), LocaleController.getString(R.string.AccDescrMentionDown), LocaleController.getString(R.string.AccDescrReactionMentionDown), LocaleController.getString(R.string.AccDescrPollVotesMentionDown), LocaleController.getString(R.string.AccDescrSearchPrev), LocaleController.getString(R.string.AccDescrSearchNext)};
        this.e = new m[7];
        this.f = new i[7];
        this.r = 83;
        this.d = aVar;
        this.c = bVar;
        this.b = g6Var;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11 = i10 >> 16;
        int i12 = i10 & 65535;
        if (i11 >= 0) {
            m[] mVarArr = this.e;
            if (i11 >= mVarArr.length || mVarArr[i11] == null) {
                return;
            }
            if (i12 == 1 || i12 == 2) {
                a();
            }
        }
    }

    public final void a() {
        int i10 = 0;
        float f10 = 0.0f;
        while (true) {
            m[] mVarArr = this.e;
            if (i10 >= mVarArr.length) {
                return;
            }
            m mVar = mVarArr[i10];
            if (mVar != null) {
                wg.b bVar = (wg.b) mVar.b;
                float f11 = ((xd.a) mVar.c).e;
                float f12 = ((xd.a) mVar.d).e;
                bVar.setVisibility(f11 > 0.0f ? 0 : 8);
                bVar.setAlpha(f11);
                bVar.setScaleX(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                bVar.setScaleY(AndroidUtilities.lerp(0.7f, 1.0f, f11));
                if (i10 != 0) {
                    bVar.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(80.0f)) - f10);
                }
                f10 += (AndroidUtilities.dp((f12 * 10.0f) + 10.0f) + AndroidUtilities.dp(44.0f)) * f11;
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

    public final void c(int i10, int i11, boolean z4) {
        b(i10).a = i11;
        m mVar = this.e[i10];
        if (mVar != null) {
            ((wg.b) mVar.b).a(i11, z4);
            ((xd.a) mVar.d).a(i11 > 0, z4);
        }
    }

    public final void d(boolean z4) {
        b(1).b = z4;
        m mVar = this.e[1];
        if (mVar != null) {
            ((wg.b) mVar.b).c(z4, true);
        }
    }

    public final void e(int i10, boolean z4, boolean z10) {
        int i11;
        int i12;
        m[] mVarArr = this.e;
        m mVar = mVarArr[i10];
        if (mVar != null || z4) {
            if (mVar == null) {
                int i13 = i10 << 16;
                xd.a aVar = new xd.a(i13 | 1, this, i10 == 0 ? pr.h : wd.a.a, i10 == 0 ? 300L : 280L, false);
                xd.a aVar2 = new xd.a(i13 | 2, this, i10 == 0 ? pr.h : wd.a.a, i10 == 0 ? 300L : 280L, false);
                if (i10 == 0) {
                    i11 = 50;
                    i12 = 32;
                } else {
                    i11 = 56;
                    i12 = 48;
                }
                Context context = getContext();
                int i14 = s[i10];
                g6 g6Var = this.b;
                wg.b bVar = new wg.b(context, g6Var);
                wg.a d = wg.a.d(context, this.d, this.c, g6Var, i14, i12);
                bVar.b = d;
                bVar.addView(d, c6.e(i11, i11, 80));
                d.setIconPadding(AndroidUtilities.dp(2.0f));
                e6.b(bVar, 0.13f, 2.0f);
                float f10 = i11 / 2.0f;
                bVar.setPivotX(AndroidUtilities.dp(f10));
                bVar.setPivotY(AndroidUtilities.dp(f10 + 8.0f));
                bVar.setVisibility(8);
                bVar.setContentDescription(this.a[i10]);
                bVar.setOnClickListener(new x0(this, i10, 27));
                bVar.setOnLongClickListener(new rm0(this, i10, 1));
                if (i10 == 6) {
                    wg.a aVar3 = bVar.b;
                    aVar3.h = -1.0f;
                    aVar3.a();
                }
                if (i10 == 1) {
                    bVar.d = true;
                    wq wqVar = bVar.c;
                    if (wqVar != null) {
                        wqVar.setReverse(true);
                    }
                }
                addView(bVar, c6.e(i11, i11 + 8, this.r));
                mVarArr[i10] = new m(bVar, aVar, aVar2, 9);
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
            ((xd.a) mVarArr[i10].c).a(z4, z10);
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

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
