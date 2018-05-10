#ifndef SIMPLESYNTH_TRACE_H
#define SIMPLESYNTH_TRACE_H

class Trace{
    public:
        static void beginSection(const char *format,...);
        static void endSection();
        static void initialize();
    private:
        static bool is_tracing_supported_;
};

#endif //SIMPLESYNTH_TRACE_H