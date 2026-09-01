package r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class j0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final w d = new w();
    public static final y e = new y();

    public static m0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        m0 m0Var = (m0) a.get(view);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(view);
        a.put(view, m0Var2);
        return m0Var2;
    }

    public static m1 b(View view, m1 m1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            WindowInsets a2 = i10 >= 30 ? g0.a(view, g10) : z.a(view, g10);
            if (!a2.equals(g10)) {
                return m1.h(view, a2);
            }
        }
        return m1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = i0.d;
        i0 i0Var = (i0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (i0Var == null) {
            i0Var = new i0();
            i0Var.a = null;
            i0Var.b = null;
            i0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, i0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = i0Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = i0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (i0Var.a == null) {
                            i0Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = i0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                i0Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    i0Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = i0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (i0Var.b == null) {
                    i0Var.b = new SparseArray();
                }
                i0Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f0.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] e(m.s sVar) {
        return Build.VERSION.SDK_INT >= 31 ? h0.a(sVar) : (String[]) sVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static m1 f(View view) {
        return Build.VERSION.SDK_INT >= 23 ? c0.a(view) : b0.f(view);
    }

    public static void g(int i10, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                tag = e0.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z4 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z4 ? 32 : 2048);
                obtain.setContentChangeTypes(i10);
                if (z4) {
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        charSequence = e0.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e6) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e6);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i10);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i11 >= 28) {
                charSequence = e0.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static m1 h(View view, m1 m1Var) {
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            WindowInsets b10 = z.b(view, g10);
            if (!b10.equals(g10)) {
                return m1.h(view, b10);
            }
        }
        return m1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h i(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return h0.b(view, hVar);
        }
        u0.j jVar = (u0.j) view.getTag(R.id.tag_on_receive_content_listener);
        p pVar = d;
        if (jVar == null) {
            if (view instanceof p) {
                pVar = (p) view;
            }
            return pVar.a(hVar);
        }
        h a2 = u0.j.a(view, hVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof p) {
            pVar = (p) view;
        }
        return pVar.a(a2);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            f0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.b);
    }

    public static void l(View view, CharSequence charSequence) {
        new x(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        y yVar = e;
        if (charSequence == null) {
            yVar.a.remove(view);
            view.removeOnAttachStateChangeListener(yVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(yVar);
        } else {
            yVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(yVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yVar);
            }
        }
    }

    public static void m(View view, o oVar) {
        b0.j(view, oVar);
    }
}
