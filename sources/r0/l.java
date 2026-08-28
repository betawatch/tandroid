package r0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public l(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z10) {
        ViewParent e10;
        if (this.d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedFling(this.c, f10, f11, z10);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedFling", e11);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent e10;
        if (this.d && (e10 = e(0)) != null) {
            try {
                return e10.onNestedPreFling(this.c, f10, f11);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreFling", e11);
            }
        }
        return false;
    }

    public final boolean c(int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        ViewParent e10;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.d || (e10 = e(i11)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e10 instanceof m) {
            ((m) e10).E(viewGroup, i9, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                e10.onNestedPreScroll(viewGroup, i9, i10, iArr3);
            } catch (AbstractMethodError e11) {
                Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedPreScroll", e11);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent e10;
        int i14;
        int i15;
        int[] iArr3;
        if (this.d && (e10 = e(i13)) != null) {
            if (i9 != 0 || i10 != 0 || i11 != 0 || i12 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i14 = iArr[0];
                    i15 = iArr[1];
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e10 instanceof n) {
                    ((n) e10).i(viewGroup, i9, i10, i11, i12, i13, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i11;
                    iArr3[1] = iArr3[1] + i12;
                    if (e10 instanceof m) {
                        ((m) e10).c(viewGroup, i9, i10, i11, i12, i13);
                    } else if (i13 == 0) {
                        try {
                            e10.onNestedScroll(viewGroup, i9, i10, i11, i12);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onNestedScroll", e11);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i14;
                    iArr[1] = iArr[1] - i15;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i9) {
        if (i9 == 0) {
            return this.a;
        }
        if (i9 != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i9) {
        return e(i9) != null;
    }

    public final boolean g(int i9, int i10) {
        boolean onStartNestedScroll;
        if (!f(i10)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z10 = parent instanceof m;
                    if (z10) {
                        onStartNestedScroll = ((m) parent).q(view2, view, i9, i10);
                    } else {
                        if (i10 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i9);
                            } catch (AbstractMethodError e10) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i10 == 0) {
                            this.a = parent;
                        } else if (i10 == 1) {
                            this.b = parent;
                        }
                        if (z10) {
                            ((m) parent).t(view2, view, i9, i10);
                        } else if (i10 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i9);
                            } catch (AbstractMethodError e11) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i9) {
        ViewParent e10 = e(i9);
        if (e10 != null) {
            boolean z10 = e10 instanceof m;
            ViewGroup viewGroup = this.c;
            if (z10) {
                ((m) e10).p(i9, viewGroup);
            } else if (i9 == 0) {
                try {
                    e10.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewParentCompat", "ViewParent " + e10 + " does not implement interface method onStopNestedScroll", e11);
                }
            }
            if (i9 == 0) {
                this.a = null;
            } else {
                if (i9 != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
